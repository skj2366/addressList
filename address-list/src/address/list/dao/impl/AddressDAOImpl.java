package address.list.dao.impl;

import java.util.List;
import java.util.Map;

import address.list.dao.AddressDAO;
import address.list.data.AddressData;

public class AddressDAOImpl implements AddressDAO {

	@Override
	public List<Map<String, String>> selectAddressList() {
		return AddressData.ADDRESS_LIST;
	}

	@Override
	public boolean insertAddress(Map<String, String> address) {
		return AddressData.ADDRESS_LIST.add(address);
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> address) {
		for(int i=0;i<AddressData.ADDRESS_LIST.size();i++) {
			Map<String,String> ad = AddressData.ADDRESS_LIST.get(i);
			if(ad.get("번호").equals(address.get("번호"))) {
				return ad;
			}
		}
		return null;
	}

}
