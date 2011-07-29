/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mulesoft.demo.zuora;

import org.mule.construct.Flow;
import org.mule.tck.FunctionalTestCase;

public class ZuoraFunctionalTestDriver extends FunctionalTestCase
{

    @Override
    protected String getConfigResources()
    {
        return "mule-config.xml";
    }

    public void testMigrateZuora() throws Exception
    {
        lookupFlowConstruct("MigrateZuoraAccounts").process(getTestEvent(""));
    }
    
    public void testMigrateSalesforce() throws Exception
    {
        lookupFlowConstruct("MigrateSalesforceAccounts").process(getTestEvent(""));
    }

    private Flow lookupFlowConstruct(final String name)
    {
        return (Flow)muleContext.getRegistry().lookupFlowConstruct(name);
    }

}
