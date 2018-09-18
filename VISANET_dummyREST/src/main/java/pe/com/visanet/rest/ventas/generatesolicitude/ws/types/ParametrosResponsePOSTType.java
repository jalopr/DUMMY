
package pe.com.visanet.rest.ventas.generatesolicitude.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.com.visanet.soap.generic.visanetaudit.ws.types.AuditResponseType;


/**
 * <p>Clase Java para parametrosResponsePOSTType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="parametrosResponsePOSTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auditResponse" type="{http://visanet.com.pe/soap/generic/visanetAudit/ws/types}AuditResponseType"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosResponsePOSTType", propOrder = {
    "auditResponse",
    "state",
    "date"
})
public class ParametrosResponsePOSTType {

    @XmlElement(required = true)
    protected AuditResponseType auditResponse;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String date;

    /**
     * Obtiene el valor de la propiedad auditResponse.
     * 
     * @return
     *     possible object is
     *     {@link AuditResponseType }
     *     
     */
    public AuditResponseType getAuditResponse() {
        return auditResponse;
    }

    /**
     * Define el valor de la propiedad auditResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditResponseType }
     *     
     */
    public void setAuditResponse(AuditResponseType value) {
        this.auditResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}
