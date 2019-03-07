package address.list.service.impl;

import java.util.List;
import java.util.Map;

import address.list.dao.AddressDAO;
import address.list.dao.impl.AddressDAOImpl;
import address.list.service.AddressService;

public class AddressServiceImpl implements AddressService {

	private AddressDAO addao = new AddressDAOImpl();
	@Override
	public List<Map<String, String>> selectAddressList() {

		return addao.selectAddressList();
	}

	@Override
	public boolean insertAddress(Map<String, String> address) {

		return addao.insertAddress(address);
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> address) {

		return addao.selectAddress(address);
	}

}
