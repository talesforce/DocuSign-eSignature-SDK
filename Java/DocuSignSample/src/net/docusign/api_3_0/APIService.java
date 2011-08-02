package net.docusign.api_3_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-07-27T15:53:12.779-07:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "APIService", 
                  wsdlLocation = "https://www.docusign.net/api/3.0/api.asmx?wsdl",
                  targetNamespace = "http://www.docusign.net/API/3.0") 
public class APIService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.docusign.net/API/3.0", "APIService");
    public final static QName APIServiceSoap12 = new QName("http://www.docusign.net/API/3.0", "APIServiceSoap12");
    public final static QName APIServiceSoap = new QName("http://www.docusign.net/API/3.0", "APIServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("https://www.docusign.net/api/3.0/api.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(APIService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://demo.docusign.net/api/3.0/api.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public APIService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public APIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public APIService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *     returns APIServiceSoap
     */
    @WebEndpoint(name = "APIServiceSoap12")
    public APIServiceSoap getAPIServiceSoap12() {
        return super.getPort(APIServiceSoap12, APIServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns APIServiceSoap
     */
    @WebEndpoint(name = "APIServiceSoap12")
    public APIServiceSoap getAPIServiceSoap12(WebServiceFeature... features) {
        return super.getPort(APIServiceSoap12, APIServiceSoap.class, features);
    }
    /**
     *
     * @return
     *     returns APIServiceSoap
     */
    @WebEndpoint(name = "APIServiceSoap")
    public APIServiceSoap getAPIServiceSoap() {
        return super.getPort(APIServiceSoap, APIServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns APIServiceSoap
     */
    @WebEndpoint(name = "APIServiceSoap")
    public APIServiceSoap getAPIServiceSoap(WebServiceFeature... features) {
        return super.getPort(APIServiceSoap, APIServiceSoap.class, features);
    }

}