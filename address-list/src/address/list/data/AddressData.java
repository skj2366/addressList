package address.list.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressData {

	public static final List<Map<String,String>> ADDRESS_LIST = new ArrayList<>();
	static {
		Map<String, String> map = new HashMap<>();
		
		map.put("번호","1");
		map.put("건물명","현대아파트");
		map.put("주소","충청남도 천안시 서북구 쌍용17길 52");
		map.put("소유주","김동근");
		map.put("연락처","010-8402-1055");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("번호","2");
		map.put("건물명","시영아파트");
		map.put("주소","충청남도 천안시 시영아파트");
		map.put("소유주","아무개");
		map.put("연락처","041-592-xxxx");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("번호","3");
		map.put("건물명","리오빌");
		map.put("주소","충청남도 천안시 서북구 쌍용17길 43");
		map.put("소유주","개무아");
		map.put("연락처","041-593-xxxx");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("번호","4");
		map.put("건물명","쌍용역");
		map.put("주소","충청남도 천안시 서북구 쌍용17길");
		map.put("소유주","천안시");
		map.put("연락처","041-594-xxxx");
		ADDRESS_LIST.add(map);
		
	}
}
