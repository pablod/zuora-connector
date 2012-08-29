package com.zuora.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-08-28T17:54:23.694-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "ZuoraService", 
                  wsdlLocation = "file:/home/maverickme/workspace/zuora-connector/src/main/resources/zuora-32.modified.wsdl",
                  targetNamespace = "http://api.zuora.com/") 
public class ZuoraService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://api.zuora.com/", "ZuoraService");
    public final static QName Soap = new QName("http://api.zuora.com/", "Soap");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/maverickme/workspace/zuora-connector/src/main/resources/zuora-32.modified.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ZuoraService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/maverickme/workspace/zuora-connector/src/main/resources/zuora-32.modified.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ZuoraService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ZuoraService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZuoraService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Soap
     */
    @WebEndpoint(name = "Soap")
    public Soap getSoap() {
        return super.getPort(Soap, Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Soap
     */
    @WebEndpoint(name = "Soap")
    public Soap getSoap(WebServiceFeature... features) {
        return super.getPort(Soap, Soap.class, features);
    }

}