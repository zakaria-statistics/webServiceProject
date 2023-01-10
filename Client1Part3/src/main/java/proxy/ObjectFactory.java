
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JAXBException_QNAME = new QName("http://webService.enset.ma/", "JAXBException");
    private final static QName _GetReleveService_QNAME = new QName("http://webService.enset.ma/", "getReleveService");
    private final static QName _GetReleveServiceResponse_QNAME = new QName("http://webService.enset.ma/", "getReleveServiceResponse");
    private final static QName _ReleveService_QNAME = new QName("http://webService.enset.ma/", "releveService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     * @return
     *     the new instance of {@link JAXBException }
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link GetReleveService }
     * 
     * @return
     *     the new instance of {@link GetReleveService }
     */
    public GetReleveService createGetReleveService() {
        return new GetReleveService();
    }

    /**
     * Create an instance of {@link GetReleveServiceResponse }
     * 
     * @return
     *     the new instance of {@link GetReleveServiceResponse }
     */
    public GetReleveServiceResponse createGetReleveServiceResponse() {
        return new GetReleveServiceResponse();
    }

    /**
     * Create an instance of {@link ReleveService }
     * 
     * @return
     *     the new instance of {@link ReleveService }
     */
    public ReleveService createReleveService() {
        return new ReleveService();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     * @return
     *     the new instance of {@link Operations }
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     * @return
     *     the new instance of {@link Throwable }
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     * @return
     *     the new instance of {@link StackTraceElement }
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.enset.ma/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReleveService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReleveService }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.enset.ma/", name = "getReleveService")
    public JAXBElement<GetReleveService> createGetReleveService(GetReleveService value) {
        return new JAXBElement<>(_GetReleveService_QNAME, GetReleveService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReleveServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReleveServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.enset.ma/", name = "getReleveServiceResponse")
    public JAXBElement<GetReleveServiceResponse> createGetReleveServiceResponse(GetReleveServiceResponse value) {
        return new JAXBElement<>(_GetReleveServiceResponse_QNAME, GetReleveServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleveService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReleveService }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.enset.ma/", name = "releveService")
    public JAXBElement<ReleveService> createReleveService(ReleveService value) {
        return new JAXBElement<>(_ReleveService_QNAME, ReleveService.class, null, value);
    }

}
