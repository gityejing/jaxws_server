package jaxws_server;
 

import javax.xml.ws.Endpoint;

//实现监听器接口
public class Publisher   {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/aswebservice",new Method1());
	}
}
