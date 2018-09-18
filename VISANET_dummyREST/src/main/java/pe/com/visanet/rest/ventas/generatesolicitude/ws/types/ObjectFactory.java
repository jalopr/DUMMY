
package pe.com.visanet.rest.ventas.generatesolicitude.ws.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.visanet.rest.ventas.generatesolicitude.ws.types package. 
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

    private final static QName _ParametrosRequestGET_QNAME = new QName("http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", "parametrosRequestGET");
    private final static QName _ParametrosRequestPOST_QNAME = new QName("http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", "parametrosRequestPOST");
    private final static QName _ParametrosRequestDELETE_QNAME = new QName("http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", "parametrosRequestDELETE");
    private final static QName _ParametrosResponseGET_QNAME = new QName("http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", "parametrosResponseGET");
    private final static QName _ParametrosResponsePOST_QNAME = new QName("http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", "parametrosResponsePOST");
    private final static QName _ParametrosResponseDELETE_QNAME = new QName("http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", "parametrosResponseDELETE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.visanet.rest.ventas.generatesolicitude.ws.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParametrosResponseGETType }
     * 
     */
    public ParametrosResponseGETType createParametrosResponseGETType() {
        return new ParametrosResponseGETType();
    }

    /**
     * Create an instance of {@link ParametrosRequestGETType }
     * 
     */
    public ParametrosRequestGETType createParametrosRequestGETType() {
        return new ParametrosRequestGETType();
    }

    /**
     * Create an instance of {@link ParametrosRequestPOSTType }
     * 
     */
    public ParametrosRequestPOSTType createParametrosRequestPOSTType() {
        return new ParametrosRequestPOSTType();
    }

    /**
     * Create an instance of {@link ParametrosRequestDELETEType }
     * 
     */
    public ParametrosRequestDELETEType createParametrosRequestDELETEType() {
        return new ParametrosRequestDELETEType();
    }

    /**
     * Create an instance of {@link ParametrosResponsePOSTType }
     * 
     */
    public ParametrosResponsePOSTType createParametrosResponsePOSTType() {
        return new ParametrosResponsePOSTType();
    }

    /**
     * Create an instance of {@link ParametrosResponseDELETEType }
     * 
     */
    public ParametrosResponseDELETEType createParametrosResponseDELETEType() {
        return new ParametrosResponseDELETEType();
    }

    /**
     * Create an instance of {@link ParametrosResponseGETType.Dato }
     * 
     */
    public ParametrosResponseGETType.Dato createParametrosResponseGETTypeDato() {
        return new ParametrosResponseGETType.Dato();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrosRequestGETType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", name = "parametrosRequestGET")
    public JAXBElement<ParametrosRequestGETType> createParametrosRequestGET(ParametrosRequestGETType value) {
        return new JAXBElement<ParametrosRequestGETType>(_ParametrosRequestGET_QNAME, ParametrosRequestGETType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrosRequestPOSTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", name = "parametrosRequestPOST")
    public JAXBElement<ParametrosRequestPOSTType> createParametrosRequestPOST(ParametrosRequestPOSTType value) {
        return new JAXBElement<ParametrosRequestPOSTType>(_ParametrosRequestPOST_QNAME, ParametrosRequestPOSTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrosRequestDELETEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", name = "parametrosRequestDELETE")
    public JAXBElement<ParametrosRequestDELETEType> createParametrosRequestDELETE(ParametrosRequestDELETEType value) {
        return new JAXBElement<ParametrosRequestDELETEType>(_ParametrosRequestDELETE_QNAME, ParametrosRequestDELETEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrosResponseGETType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", name = "parametrosResponseGET")
    public JAXBElement<ParametrosResponseGETType> createParametrosResponseGET(ParametrosResponseGETType value) {
        return new JAXBElement<ParametrosResponseGETType>(_ParametrosResponseGET_QNAME, ParametrosResponseGETType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrosResponsePOSTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", name = "parametrosResponsePOST")
    public JAXBElement<ParametrosResponsePOSTType> createParametrosResponsePOST(ParametrosResponsePOSTType value) {
        return new JAXBElement<ParametrosResponsePOSTType>(_ParametrosResponsePOST_QNAME, ParametrosResponsePOSTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrosResponseDELETEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visanet.com.pe/rest/ventas/generatesolicitude/ws/types", name = "parametrosResponseDELETE")
    public JAXBElement<ParametrosResponseDELETEType> createParametrosResponseDELETE(ParametrosResponseDELETEType value) {
        return new JAXBElement<ParametrosResponseDELETEType>(_ParametrosResponseDELETE_QNAME, ParametrosResponseDELETEType.class, null, value);
    }

}
