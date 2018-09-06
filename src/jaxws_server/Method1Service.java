package jaxws_server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Method1Service {
	@WebMethod
	int getCount(String Money);

	@WebMethod
	int getCount1(String Money);

	@WebMethod
	int getCount2(String Money);

	@WebMethod
	int getCount3(String Money);

	@WebMethod
	int getCount4(String Money);

	@WebMethod
	int getCount5(String Money);

	@WebMethod
	int getCount6(String Money);
	
	@WebMethod
	public int getCountX(int money);
}

