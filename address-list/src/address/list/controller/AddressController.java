package address.list.controller;

import java.util.HashMap;
import java.util.Map;

import address.list.service.AddressService;
import address.list.service.impl.AddressServiceImpl;

public class AddressController {

	private AddressService as = new AddressServiceImpl();

	public void doGet(Map<String,String> req, Map<String,Object> res) {
		String cmd = req.get("cmd");
		String number = req.get("number");
		Map<String,String> address = new HashMap<>();
		address.put("번호",number);
		if("addresslist".equals(cmd)) {
			res.put("addresslist",as.selectAddressList());
		}else if("address".equals(cmd)) {
			res.put("address",as.selectAddress(address));
		}
		
	}
	
	public void doPost(Map<String,String>req, Map<String,Object> res) {
		String cmd = req.get("cmd");
		String number = req.get("number");
		String name = req.get("name");
		String phone = req.get("phone");
		Map<String,String> address = new HashMap<>();
		address.put("번호",number);
		address.put("건물명",name);
		address.put("연락처",phone);
		if("insert".equals(cmd)) {
			res.put("insert",as.insertAddress(address));
		}
		
	}
	
}
