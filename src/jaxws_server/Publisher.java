package jaxws_server;
 

import javax.xml.ws.Endpoint;

//ʵ�ּ������ӿ�
public class Publisher   {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/aswebservice",new Method1());
	}
}
