
/**
 * WebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */

    package me.omarvera.cliente;

    /**
     *  WebServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for Estacion method
            * override this method for handling normal response from Estacion operation
            */
           public void receiveResultEstacion(
                    me.omarvera.cliente.WebServiceStub.EstacionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from Estacion operation
           */
            public void receiveErrorEstacion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for HelloWorld method
            * override this method for handling normal response from HelloWorld operation
            */
           public void receiveResultHelloWorld(
                    me.omarvera.cliente.WebServiceStub.HelloWorldResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from HelloWorld operation
           */
            public void receiveErrorHelloWorld(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for EstacionDatos method
            * override this method for handling normal response from EstacionDatos operation
            */
           public void receiveResultEstacionDatos(
                    me.omarvera.cliente.WebServiceStub.EstacionDatosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from EstacionDatos operation
           */
            public void receiveErrorEstacionDatos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for THI method
            * override this method for handling normal response from THI operation
            */
           public void receiveResultTHI(
                    me.omarvera.cliente.WebServiceStub.THIResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from THI operation
           */
            public void receiveErrorTHI(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for Mario method
            * override this method for handling normal response from Mario operation
            */
           public void receiveResultMario(
                    me.omarvera.cliente.WebServiceStub.MarioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from Mario operation
           */
            public void receiveErrorMario(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for EnviarReporteEst method
            * override this method for handling normal response from EnviarReporteEst operation
            */
           public void receiveResultEnviarReporteEst(
                    me.omarvera.cliente.WebServiceStub.EnviarReporteEstResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from EnviarReporteEst operation
           */
            public void receiveErrorEnviarReporteEst(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetEstaciones method
            * override this method for handling normal response from GetEstaciones operation
            */
           public void receiveResultGetEstaciones(
                    me.omarvera.cliente.WebServiceStub.GetEstacionesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetEstaciones operation
           */
            public void receiveErrorGetEstaciones(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetPronosticos method
            * override this method for handling normal response from GetPronosticos operation
            */
           public void receiveResultGetPronosticos(
                    me.omarvera.cliente.WebServiceStub.GetPronosticosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetPronosticos operation
           */
            public void receiveErrorGetPronosticos(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetDataStationTemtHumr method
            * override this method for handling normal response from GetDataStationTemtHumr operation
            */
           public void receiveResultGetDataStationTemtHumr(
                    me.omarvera.cliente.WebServiceStub.GetDataStationTemtHumrResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetDataStationTemtHumr operation
           */
            public void receiveErrorGetDataStationTemtHumr(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ReporteEst method
            * override this method for handling normal response from ReporteEst operation
            */
           public void receiveResultReporteEst(
                    me.omarvera.cliente.WebServiceStub.ReporteEstResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ReporteEst operation
           */
            public void receiveErrorReporteEst(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GPSEstaciones method
            * override this method for handling normal response from GPSEstaciones operation
            */
           public void receiveResultGPSEstaciones(
                    me.omarvera.cliente.WebServiceStub.GPSEstacionesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GPSEstaciones operation
           */
            public void receiveErrorGPSEstaciones(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetEstacionesPorNombre method
            * override this method for handling normal response from GetEstacionesPorNombre operation
            */
           public void receiveResultGetEstacionesPorNombre(
                    me.omarvera.cliente.WebServiceStub.GetEstacionesPorNombreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetEstacionesPorNombre operation
           */
            public void receiveErrorGetEstacionesPorNombre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetEstadisticos method
            * override this method for handling normal response from GetEstadisticos operation
            */
           public void receiveResultGetEstadisticos(
                    me.omarvera.cliente.WebServiceStub.GetEstadisticosResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetEstadisticos operation
           */
            public void receiveErrorGetEstadisticos(java.lang.Exception e) {
            }
                


    }
    