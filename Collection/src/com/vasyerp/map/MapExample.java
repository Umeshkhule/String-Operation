package com.vasyerp.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		PhoneDirectory phoneDirectory1=new PhoneDirectory(9876543210l,"satyam kumar");
		PhoneDirectory phoneDirectory2=new PhoneDirectory(8754423190l,"yash satni");
		PhoneDirectory phoneDirectory3=new PhoneDirectory(9864529837l,"vijay kumar");
		Map<Long,String> map=new HashMap<>();
		map.put(phoneDirectory1.number,phoneDirectory1.name);
		map.put(phoneDirectory2.number,phoneDirectory2.name);
		map.put(phoneDirectory3.number,phoneDirectory3.name);
		System.out.println(map);
	}
}
