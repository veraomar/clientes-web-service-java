
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
 *         &lt;element name="GetPronosticosResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getPronosticosResult"
})
@XmlRootElement(name = "GetPronosticosResponse")
public class GetPronosticosResponse {

    @XmlElement(name = "GetPronosticosResult")
    protected String getPronosticosResult;

    /**
     * Obtiene el valor de la propiedad getPronosticosResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPronosticosResult() {
        return getPronosticosResult;
    }

    /**
     * Define el valor de la propiedad getPronosticosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPronosticosResult(String value) {
        this.getPronosticosResult = value;
    }

}
