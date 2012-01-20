package org.mule.modules.zuora;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.utils.date.XmlGregorianCalendars;
import org.mule.tck.AbstractMuleTestCase;
import org.mule.tck.FunctionalTestCase;

public class ZuoraDateHandlingTestDriver extends FunctionalTestCase
{

    @Override
    protected String getConfigResources()
    {
        return "payment-example.xml";
    }

    @Test
    public void testPaymentWithStringDateFlow() throws Exception
    {
        MessageProcessor flow = lookupFlowConstruct("example");
        Map<String, Object> payload = getDefaultMap();
        payload.put("effectiveDate", "2012-01-09T12:18:14-03:00");
        MuleMessage message = flow.process(getTestEvent(payload)).getMessage();
        
        assertNull(message.getExceptionPayload());
    }

    @Test 
    public void testPaymentWithXMLGregorianCalendarDateFlow() throws Exception
    {
        MessageProcessor flow = lookupFlowConstruct("example");
        Map<String, Object> payload = getDefaultMap();
        payload.put("effectiveDate", XmlGregorianCalendars.from(new Date()));
        MuleMessage message = flow.process(getTestEvent(payload)).getMessage();
        
        assertNull(message.getExceptionPayload());
    }
    
    private Map<String, Object> getDefaultMap()
    {
        return new HashMap<String, Object>(){{
            put("zAccount", "123123");
            put("amount", 45);
            put("zuorainvoiceid", "123123");
            put("paymentMethodId", "123123");
            put("refid", "123123");
        }};
    }
    /**
     * Retrieve a flow by name from the registry
     * 
     * @param name Name of the flow to retrieve
     */
    protected MessageProcessor lookupFlowConstruct(String name)
    {
        return (MessageProcessor) AbstractMuleTestCase.muleContext.getRegistry().lookupFlowConstruct(name);
    }
}
