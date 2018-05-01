package me.omarvera.main;

import me.omarvera.cliente.WebServiceStub;

public class Test {

	public static void main(String[] args) {

			WebServiceStub customer = null;
			WebServiceStub.HelloWorld request = null;
			WebServiceStub.HelloWorldResponse response = null;
			
			try {
				customer = new WebServiceStub();
				request = new WebServiceStub.HelloWorld();
			
				response = customer.HelloWorld(request);
				
				System.out.println(response.getHelloWorldResult());
				
				WebServiceStub.Mario requestMario = new WebServiceStub.Mario();
				requestMario.setOpc(2);
				
				WebServiceStub.MarioResponse reponseMario = customer.Mario(requestMario);
				
				System.out.println("Sevicio Mario ================");
				System.out.println(reponseMario.getMarioResult());
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
	}

}
