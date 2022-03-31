package com.vasyerp.listmap;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		map.put(100,"Umesh");
		map.put(101,"Satyam");
		map.put(102,"Yash");
		map.put(103,"Yash");
		List<Map<Integer,String>> list=new ArrayList<>();
		list.add(map);
		System.out.println(list);
		Map<Integer,String> innerMap;
		for(int i=0;i<list.size();i++)
		{
			innerMap = list.get(i);  
//			innerMap.get(102);
			for (Map.Entry<Integer, String> entry : innerMap.entrySet())
			{
				if(entry.getValue()=="Yash") {
					System.out.println(entry.getKey() + "=" + entry.getValue());
				}
			}
		}
	}
}
