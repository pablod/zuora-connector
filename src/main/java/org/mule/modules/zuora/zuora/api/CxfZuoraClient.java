/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api;

import com.zuora.api.*;
import com.zuora.api.object.ZObject;
import org.apache.commons.lang.Validate;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.mule.modules.zuora.User;
import org.mule.modules.zuora.zuora.api.internal.PaginatedIterable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.MessageContext;
import java.util.*;
import java.util.Map.Entry;

/**
 * Implementation of {@link ZuoraClient} based on a slightly modified version of
 * the open-source <a href="http://code.google.com/p/sfdc-wsc/">fsdc-wsc</a>.
 * Although that client is sales-force specific, it works with with Zuora since
 * both APIs have very similar WSDL interfaces
 *
 * @author flbulgarelli
 */
public class CxfZuoraClient implements ZuoraClient<Exception> {
    private final String username;
    private final String password;
    private final String endpoint;
    private JAXBDataBinding jSessionDataBinding;
    private final Soap soap;
    private final String sessionId;

    public CxfZuoraClient(@NotNull String username, @NotNull String password,
                          @NotNull String endpoint) throws UnexpectedErrorFault, LoginFault {
        Validate.notNull(username);
        Validate.notNull(password);
        Validate.notNull(endpoint);
        this.username = username;
        this.password = password;
        this.endpoint = endpoint;
        try {
            jSessionDataBinding = new JAXBDataBinding(SessionHeader.class);
        } catch (JAXBException e) {
            throw new AssertionError(e);
        }

        ZuoraService serviceLocator = new ZuoraService(getClass().getResource(
                "/zuora-29.wsdl"));
        this.soap = serviceLocator.getPort(Soap.class);

        BindingProvider bindingProvider = ((BindingProvider) this.soap);
        bindingProvider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

        LoginResult loginResult;
        loginResult = this.soap.login(username, password);

        bindingProvider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                loginResult.getServerUrl());
        bindingProvider.getRequestContext().put(
                MessageContext.HTTP_REQUEST_HEADERS,
                new HashMap<String, List<String>>());

        sessionId = loginResult.getSession();

        SessionHeader sh = new SessionHeader();
        sh.setSession(loginResult.getSession());

        bindingProvider.getRequestContext().put(
                Header.HEADER_LIST,
                Arrays.asList(new Header(new QName(
                        "urn:partner.soap.sforce.com", "SessionHeader"), sh,
                        jSessionDataBinding)));

    }

    public String getSessionId() {
        return sessionId;
    }

    @Override
    public List<AmendResult> amend(List<AmendRequest> amendaments)
            throws Exception {
        Validate.notEmpty(amendaments);

        try {
            return soap.amend(amendaments);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SaveResult> create(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);

        try {
            return this.soap.create(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<DeleteResult> delete(String type, List<String> ids)
            throws Exception {
        Validate.notEmpty(ids);
        Validate.notEmpty(type);

        try {
            return this.soap.delete(type, ids);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public Iterable<ZObject> find(final String zquery) throws Exception {
        Validate.notEmpty(zquery);
        
        List<ZObject> allRecords = new ArrayList<ZObject>();
        
        QueryResult result = soap.query(zquery);
        while( !result.isDone() ) {
            allRecords.addAll(result.getRecords());
            result = soap.queryMore(result.getQueryLocator());
        }

        return allRecords;
    }

    @Override
    public List<SaveResult> generate(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);

        try {
            return this.soap.generate(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public User getUserInfo() throws Exception {

        try {
            Holder<String> userId = new Holder<String>();
            Holder<String> tenantId = new Holder<String>();
            Holder<String> tenantName = new Holder<String>();
            Holder<String> userEmail = new Holder<String>();
            Holder<String> userFullName = new Holder<String>();
            Holder<String> username = new Holder<String>();
            this.soap.getUserInfo(tenantId, tenantName, userEmail,
                    userFullName, userId, username);
            // TODO
            return new User(userId.value, username.value, userEmail.value,
                    userFullName.value, tenantId.value, tenantName.value);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SubscribeResult> subscribe(List<SubscribeRequest> subscriptions)
            throws Exception {
        Validate.notEmpty(subscriptions);

        try {
            return this.soap.subscribe(subscriptions);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }
    }

    @Override
    public List<SaveResult> update(List<ZObject> zobjects) throws Exception {
        Validate.notEmpty(zobjects);
        try {
            return this.soap.update(zobjects);
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }

    }

    @Override
    public Map<String, Object> productProfile(String productId)
            throws Exception {
        // TODO Auto-generated method stub
        HashMap<String, Object> productprofile = new HashMap<String, Object>();

        try {
            Validate.notEmpty(productId);

            String productQuery = "select Category,Description,EffectiveEndDate,EffectiveStartDate,Name,SKU from Product where id = '"
                    + productId + "'";

            QueryResult qr = this.soap.query(productQuery);
            if (qr.getSize() != 0) {

                Collection<Entry<String, Object>> productCollection = qr
                        .getRecords().get(0).properties();
                productprofile = getAsHashMap(productCollection);

                String productRatePlanQuery = "select Description,EffectiveEndDate,EffectiveStartDate,Name from ProductRatePlan where ProductId = '"
                        + productId + "'";
                List<ZObject> ratePlans = this.soap.query(
                        productRatePlanQuery).getRecords();
                List<HashMap<String, Object>> ratePlanList = new ArrayList<HashMap<String, Object>>();

                for (ZObject ratePlan : ratePlans) {
                    Collection<Entry<String, Object>> rateplanCollection = ratePlan
                            .properties();
                    HashMap<String, Object> productRatePlanMap = getAsHashMap(rateplanCollection);

                    String productRatePlanChargesQuery = "select AccountingCode,BillCycleDay,BillCycleType,BillingPeriod,BillingPeriodAlignment,ChargeModel,ChargeType,DefaultQuantity,Description,IncludedUnits,MaxQuantity,MinQuantity,Name,NumberOfPeriod,OverageCalculationOption,OverageUnusedUnitsCreditOption,RevRecCode,RevRecTriggerCondition,SmoothingModel,SpecificBillingPeriod,Taxable,TaxCode,TriggerEvent,UOM from ProductRatePlanCharge where ProductRatePlanId ='"
                            + productRatePlanMap.get("id") + "'";
                    List<ZObject> productRatePlanCharges = this.soap.query(
                            productRatePlanChargesQuery).getRecords();
                    List<HashMap<String, Object>> productRatePlanChargeList = new ArrayList<HashMap<String, Object>>();

                    for (ZObject ratePlanCharge : productRatePlanCharges) {
                        Collection<Entry<String, Object>> rateplanCargeCollection = ratePlanCharge
                                .properties();
                        HashMap<String, Object> productRatePlanChargeMap = getAsHashMap(rateplanCargeCollection);

                        String productRatePlanChargesTierQuery = "select Active,Currency,EndingUnit,IsOveragePrice,Price,PriceFormat,StartingUnit,Tier from ProductRatePlanChargeTier where ProductRatePlanChargeId ='"
                                + productRatePlanChargeMap.get("id") + "'";
                        List<ZObject> productRatePlanChargeTiers = this.soap
                                .query(productRatePlanChargesTierQuery)
                                .getRecords();
                        List<HashMap<String, Object>> productRatePlanChargeTierList = new ArrayList<HashMap<String, Object>>();
                        for (ZObject ratePlanChargeTier : productRatePlanChargeTiers) {
                            Collection<Entry<String, Object>> rateplanCargeTierCollection = ratePlanChargeTier
                                    .properties();
                            HashMap<String, Object> productRatePlanChargeTierMap = getAsHashMap(rateplanCargeTierCollection);
                            productRatePlanChargeTierList
                                    .add(productRatePlanChargeTierMap);

                        }
                        productRatePlanChargeMap.put("ProductRatePlanChargeTiers",
                                productRatePlanChargeTierList);

                        productRatePlanChargeList.add(productRatePlanChargeMap);
                    }
                    productRatePlanMap.put("ProductRatePlanCharges",
                            productRatePlanChargeList);
                    ratePlanList.add(productRatePlanMap);

                }
                productprofile.put("ProductRatePlans", ratePlanList);
            } else {
                productprofile.put("error", "Unable to find a product with the id: " + productId);
            }
        } catch (UnexpectedErrorFault unexpectedErrorFault) {
            if (unexpectedErrorFault.getFaultInfo().getFaultCode() == ErrorCode.INVALID_SESSION) {
                throw new SessionTimedOutException();
            }
            throw unexpectedErrorFault;
        }

        return productprofile;
    }

    private HashMap<String, Object> getAsHashMap(
            Collection<Entry<String, Object>> col) {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        for (Entry<String, Object> e : col) {
            hm.put(e.getKey().toString(), e.getValue().toString());
        }
        return hm;
    }


}
