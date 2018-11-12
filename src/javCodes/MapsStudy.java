package javCodes;

import java.util.HashMap;
import java.util.Map;

public class MapsStudy {
	public static void main(String[] args) {
		
	
	Map<String, String> map=new HashMap<>();
	
	//System.out.println(map);
	map.put("Malaysia", "KL");
	//Key=Malaysia, Value+KL//
	
	
	System.out.println(map);	
	
	map.put("Azeria", "Sheki");
	
	map.put("Turkiye", "KM");
	System.out.println(map);
	map.put("Malaysia", "sunwa");//this one replaced the former value.there is no duplicated Keys allowed
	System.out.println(map);
	System.out.println(map.get("Malaysia"));
	System.out.println(map.keySet());
	System.out.println(map.values());
	for(String key : map.keySet()) {
		System.out.println("key: "+key);
		System.out.println("value: "+map.get(key));
		System.out.println("+++++++");
	}
	
	}













}
