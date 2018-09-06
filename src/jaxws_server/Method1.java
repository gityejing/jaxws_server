package jaxws_server;

import javax.jws.WebService;

@WebService(endpointInterface="jaxws_server.Method1Service")  
public class Method1 implements Method1Service {  
  
    @Override  
    public int getCount(String Money) {  
        // ÒµÎñÂß¼­  
        return 5;  
    }

	@Override
	public int getCount1(String Money) {
		return 1;
	}

	@Override
	public int getCount2(String Money) {
		return 2;
	}

	@Override
	public int getCount3(String Money) {
		return 3;
	}

	@Override
	public int getCount4(String Money) {
		return 4;
	}

	@Override
	public int getCount5(String Money) {
		return 5;
	}

	@Override
	public int getCount6(String Money) {
		return 6;
	}  
  
	@Override
	public int getCountX(int money) {
		if(money == 0) {
			return 0;
		}else {
			return money * 2;
		}
	}
}