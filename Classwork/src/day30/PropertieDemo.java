package day30;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertieDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put(01, "Ganu");
		prop.put(02, "Banu");
		
		System.out.println(prop.get(01));
		
		System.out.println("Access The value using Enumeration.");
		
		Enumeration en = prop.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		System.out.println("Access The value using Iterator in the map.");
		
		Set set = prop.entrySet();
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry me = (Map.Entry)iter.next();
			System.out.println("Key:"+me.getKey()+" Value:"+me.getValue());

	}

}

}
