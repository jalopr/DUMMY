
package pe.com.visanet.rest.ventas.generatesolicitude.ws.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.com.visanet.soap.generic.visanetaudit.ws.types.AuditResponseType;


/**
 * <p>Clase Java para parametrosResponseGETType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="parametrosResponseGETType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auditResponse" type="{http://visanet.com.pe/soap/generic/visanetAudit/ws/types}AuditResponseType"/&gt;
 *         &lt;element name="dato" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="usuarioId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosResponseGETType", propOrder = {
    "auditResponse",
    "dato"
})
public class ParametrosResponseGETType {

    @XmlElement(required = true)
    protected AuditResponseType auditResponse;
    protected List<ParametrosResponseGETType.Dato> dato;

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
     * Gets the value of the dato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametrosResponseGETType.Dato }
     * 
     * 
     */
    public List<ParametrosResponseGETType.Dato> getDato() {
        if (dato == null) {
            dato = new ArrayList<ParametrosResponseGETType.Dato>();
        }
        return this.dato;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="usuarioId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usuarioId",
        "nombre",
        "apellido"
    })
    public static class Dato {

        @XmlElement(required = true)
        protected String usuarioId;
        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String apellido;

        /**
         * Obtiene el valor de la propiedad usuarioId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsuarioId() {
            return usuarioId;
        }

        /**
         * Define el valor de la propiedad usuarioId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsuarioId(String value) {
            this.usuarioId = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad apellido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApellido() {
            return apellido;
        }

        /**
         * Define el valor de la propiedad apellido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApellido(String value) {
            this.apellido = value;
        }

    }

}
