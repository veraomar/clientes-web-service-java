
package me.omarvera.clientejaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="THIResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "thiResult"
})
@XmlRootElement(name = "THIResponse")
public class THIResponse {

    @XmlElement(name = "THIResult")
    protected String thiResult;

    /**
     * Obtiene el valor de la propiedad thiResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHIResult() {
        return thiResult;
    }

    /**
     * Define el valor de la propiedad thiResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHIResult(String value) {
        this.thiResult = value;
    }

}
