
package pe.com.visanet.rest.ventas.generatesolicitude.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.com.visanet.soap.generic.visanetaudit.ws.types.AuditRequestType;


/**
 * <p>Clase Java para parametrosRequestDELETEType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="parametrosRequestDELETEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auditRequest" type="{http://visanet.com.pe/soap/generic/visanetAudit/ws/types}AuditRequestType"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosRequestDELETEType", propOrder = {
    "auditRequest",
    "code"
})
public class ParametrosRequestDELETEType {

    @XmlElement(required = true)
    protected AuditRequestType auditRequest;
    @XmlElement(required = true)
    protected String code;

    /**
     * Obtiene el valor de la propiedad auditRequest.
     * 
     * @return
     *     possible object is
     *     {@link AuditRequestType }
     *     
     */
    public AuditRequestType getAuditRequest() {
        return auditRequest;
    }

    /**
     * Define el valor de la propiedad auditRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditRequestType }
     *     
     */
    public void setAuditRequest(AuditRequestType value) {
        this.auditRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
