
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
 *         &lt;element name="GetDataStationTemtHumrResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getDataStationTemtHumrResult"
})
@XmlRootElement(name = "GetDataStationTemtHumrResponse")
public class GetDataStationTemtHumrResponse {

    @XmlElement(name = "GetDataStationTemtHumrResult")
    protected String getDataStationTemtHumrResult;

    /**
     * Obtiene el valor de la propiedad getDataStationTemtHumrResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDataStationTemtHumrResult() {
        return getDataStationTemtHumrResult;
    }

    /**
     * Define el valor de la propiedad getDataStationTemtHumrResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDataStationTemtHumrResult(String value) {
        this.getDataStationTemtHumrResult = value;
    }

}
