package com.mule_travel.travelagent;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-05-23T15:09:13.570-03:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "TravelAgentService", 
                  wsdlLocation = "file:/Users/nialdarbey/eclipse_projects/travel-reservation/src/main/resources/TravelAgentService.wsdl",
                  targetNamespace = "http://www.mule-travel.com/TravelAgent/") 
public class TravelAgentService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.mule-travel.com/TravelAgent/", "TravelAgentService");
    public final static QName TravelAgentSOAP = new QName("http://www.mule-travel.com/TravelAgent/", "TravelAgentSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/nialdarbey/eclipse_projects/travel-reservation/src/main/resources/TravelAgentService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TravelAgentService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/nialdarbey/eclipse_projects/travel-reservation/src/main/resources/TravelAgentService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TravelAgentService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TravelAgentService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TravelAgentService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns TravelAgentService
     */
    @WebEndpoint(name = "TravelAgentSOAP")
    public TravelAgentService getTravelAgentSOAP() {
        return super.getPort(TravelAgentSOAP, TravelAgentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TravelAgentService
     */
    @WebEndpoint(name = "TravelAgentSOAP")
    public TravelAgentService getTravelAgentSOAP(WebServiceFeature... features) {
        return super.getPort(TravelAgentSOAP, TravelAgentService.class, features);
    }

}
