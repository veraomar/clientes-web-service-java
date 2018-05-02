
package me.omarvera.clientejaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld", action = "http://tempuri.org/HelloWorld")
    @WebResult(name = "HelloWorldResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.HelloWorld")
    @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.HelloWorldResponse")
    public String helloWorld();

    /**
     * 
     * @param opc
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Mario", action = "http://tempuri.org/Mario")
    @WebResult(name = "MarioResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Mario", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.Mario")
    @ResponseWrapper(localName = "MarioResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.MarioResponse")
    public String mario(
        @WebParam(name = "opc", targetNamespace = "http://tempuri.org/")
        int opc);

    /**
     * 
     * @param edo
     * @param numero
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "THI", action = "http://tempuri.org/THI")
    @WebResult(name = "THIResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "THI", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.THI")
    @ResponseWrapper(localName = "THIResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.THIResponse")
    public String thi(
        @WebParam(name = "numero", targetNamespace = "http://tempuri.org/")
        String numero,
        @WebParam(name = "edo", targetNamespace = "http://tempuri.org/")
        String edo);

    /**
     * 
     * @param numero
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Estacion", action = "http://tempuri.org/Estacion")
    @WebResult(name = "EstacionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Estacion", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.Estacion")
    @ResponseWrapper(localName = "EstacionResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.EstacionResponse")
    public String estacion(
        @WebParam(name = "numero", targetNamespace = "http://tempuri.org/")
        String numero);

    /**
     * 
     * @param edo
     * @param numero
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "EstacionDatos", action = "http://tempuri.org/EstacionDatos")
    @WebResult(name = "EstacionDatosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EstacionDatos", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.EstacionDatos")
    @ResponseWrapper(localName = "EstacionDatosResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.EstacionDatosResponse")
    public String estacionDatos(
        @WebParam(name = "numero", targetNamespace = "http://tempuri.org/")
        String numero,
        @WebParam(name = "edo", targetNamespace = "http://tempuri.org/")
        String edo);

    /**
     * 
     * @param numero
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDataStationTemtHumr", action = "http://tempuri.org/GetDataStationTemtHumr")
    @WebResult(name = "GetDataStationTemtHumrResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDataStationTemtHumr", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetDataStationTemtHumr")
    @ResponseWrapper(localName = "GetDataStationTemtHumrResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetDataStationTemtHumrResponse")
    public String getDataStationTemtHumr(
        @WebParam(name = "numero", targetNamespace = "http://tempuri.org/")
        int numero);

    /**
     * 
     * @param latitud
     * @param longi
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GPSEstaciones", action = "http://tempuri.org/GPSEstaciones")
    @WebResult(name = "GPSEstacionesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GPSEstaciones", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GPSEstaciones")
    @ResponseWrapper(localName = "GPSEstacionesResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GPSEstacionesResponse")
    public String gpsEstaciones(
        @WebParam(name = "latitud", targetNamespace = "http://tempuri.org/")
        double latitud,
        @WebParam(name = "longi", targetNamespace = "http://tempuri.org/")
        double longi);

    /**
     * 
     * @param edo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetEstaciones", action = "http://tempuri.org/GetEstaciones")
    @WebResult(name = "GetEstacionesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetEstaciones", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetEstaciones")
    @ResponseWrapper(localName = "GetEstacionesResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetEstacionesResponse")
    public String getEstaciones(
        @WebParam(name = "edo", targetNamespace = "http://tempuri.org/")
        String edo);

    /**
     * 
     * @param edo
     * @param estacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetEstadisticos", action = "http://tempuri.org/GetEstadisticos")
    @WebResult(name = "GetEstadisticosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetEstadisticos", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetEstadisticos")
    @ResponseWrapper(localName = "GetEstadisticosResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetEstadisticosResponse")
    public String getEstadisticos(
        @WebParam(name = "estacion", targetNamespace = "http://tempuri.org/")
        String estacion,
        @WebParam(name = "edo", targetNamespace = "http://tempuri.org/")
        String edo);

    /**
     * 
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetEstacionesPorNombre", action = "http://tempuri.org/GetEstacionesPorNombre")
    @WebResult(name = "GetEstacionesPorNombreResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetEstacionesPorNombre", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetEstacionesPorNombre")
    @ResponseWrapper(localName = "GetEstacionesPorNombreResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetEstacionesPorNombreResponse")
    public String getEstacionesPorNombre(
        @WebParam(name = "nombre", targetNamespace = "http://tempuri.org/")
        String nombre);

    /**
     * 
     * @param numero
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetPronosticos", action = "http://tempuri.org/GetPronosticos")
    @WebResult(name = "GetPronosticosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetPronosticos", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetPronosticos")
    @ResponseWrapper(localName = "GetPronosticosResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.GetPronosticosResponse")
    public String getPronosticos(
        @WebParam(name = "numero", targetNamespace = "http://tempuri.org/")
        int numero);

    /**
     * 
     * @param idEdo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReporteEst", action = "http://tempuri.org/ReporteEst")
    @WebResult(name = "ReporteEstResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReporteEst", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.ReporteEst")
    @ResponseWrapper(localName = "ReporteEstResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.ReporteEstResponse")
    public String reporteEst(
        @WebParam(name = "idEdo", targetNamespace = "http://tempuri.org/")
        String idEdo);

    /**
     * 
     * @param idEdo
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "EnviarReporteEst", action = "http://tempuri.org/EnviarReporteEst")
    @WebResult(name = "EnviarReporteEstResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EnviarReporteEst", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.EnviarReporteEst")
    @ResponseWrapper(localName = "EnviarReporteEstResponse", targetNamespace = "http://tempuri.org/", className = "me.omarvera.clientejaxws.EnviarReporteEstResponse")
    public String enviarReporteEst(
        @WebParam(name = "idEdo", targetNamespace = "http://tempuri.org/")
        int idEdo,
        @WebParam(name = "email", targetNamespace = "http://tempuri.org/")
        String email);

}
