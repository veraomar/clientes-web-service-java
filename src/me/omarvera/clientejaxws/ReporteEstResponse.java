
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
 *         &lt;element name="ReporteEstResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "reporteEstResult"
})
@XmlRootElement(name = "ReporteEstResponse")
public class ReporteEstResponse {

    @XmlElement(name = "ReporteEstResult")
    protected String reporteEstResult;

    /**
     * Obtiene el valor de la propiedad reporteEstResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporteEstResult() {
        return reporteEstResult;
    }

    /**
     * Define el valor de la propiedad reporteEstResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporteEstResult(String value) {
        this.reporteEstResult = value;
    }

}
