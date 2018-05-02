package me.omarvera.main;

import me.omarvera.cliente.WebServiceStub;
import me.omarvera.cliente.WebServiceStub.Mario;
import me.omarvera.clientejaxws.HelloWorld;
import me.omarvera.clientejaxws.WebService;
import me.omarvera.clientejaxws.WebServiceSoap;

public class Test {

	public static void main(String[] args) {

			WebServiceStub customer = null;
			
			try {
				customer = new WebServiceStub();
				WebServiceStub.HelloWorld requestHello = new WebServiceStub.HelloWorld();
				WebServiceStub.HelloWorldResponse responseHello = customer.HelloWorld(requestHello);
				
				System.out.println("Sevicio HelloWorld ================");
				System.out.println(responseHello.getHelloWorldResult());
				
				
				WebServiceStub.Mario requestMario = new WebServiceStub.Mario();
				requestMario.setOpc(2);
				
				WebServiceStub.MarioResponse reponseMario = customer.Mario(requestMario);
				
				System.out.println("Sevicio Mario ================");
				System.out.println(reponseMario.getMarioResult());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("\n\nCliente Jax-WS ================\n\n");
		
			WebService service = new WebService();
			WebServiceSoap serSOAP = service.getWebServiceSoap();
			
			System.out.println("Sevicio HelloWorld ================");
			System.out.println(serSOAP.helloWorld());
			
			System.out.println("Sevicio Mario ================");
			System.out.println(serSOAP.mario(2));
			
//			Mario marioRequest = service.getPort(Mario.class);
//			marioRequest.setOpc(3);
//			
//			serSOAP.
			
			
	}

}
