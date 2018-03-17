package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class TestType {
	@Test
	public void testInstanceOf(){
//		char a = 'a';	
//		char b = '0';
		byte a = '0';
		byte b = 'a';
		System.out.println(a+"|"+b);

		"abc".compareTo("0");
		TreeMap<String,String> tmap = new TreeMap<>();
		tmap.put("abc", "abc");
		tmap.put("0", "0");
		for(Map.Entry<String, String> entry : tmap.entrySet()){
			System.out.println(entry.getKey());
		}
		
		System.out.println(a +"|"+b);
		//Liskov Substitution Principle 子类替换父类
		Object o =new Object();
		String s = new String();
		System.out.println(o instanceof Object);
		System.out.println(o instanceof String);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof String);
		
		System.out.println("\r");
		List list =new ArrayList<>();
		List<String> sList =new ArrayList<>();
		List<Object> oList =new ArrayList<>();
		System.out.println(list instanceof List);
//		System.out.println(list instanceof List<String>);//编译报错，泛型擦除
		sList.add("");
		oList.add("");
		Map<String,String> map =new HashMap<>();
		map.containsKey("");
		
	}
	
}
