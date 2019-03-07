package address.list;

import java.util.HashMap;
import java.util.Map;

import address.list.controller.AddressController;

public class Execute {

	public static void main(String[] args) {
		AddressController ac = new AddressController();
		Map<String,String> req = new HashMap<>();
		Map<String,Object> res = new HashMap<>();
		
		req.put("cmd","address");
		req.put("number","2");
		ac.doGet(req, res);
		System.out.println(res);
	}
}
