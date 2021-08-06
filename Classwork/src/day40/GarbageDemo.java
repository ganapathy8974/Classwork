package day40;

import java.util.Map;
import java.util.WeakHashMap;

public class GarbageDemo {

	public static void main(String[] args) {
		Map<String, String> whmp = new WeakHashMap<String, String>();
		
		String key1 = new String("a1");
		String key2 = new String("a2");
		
		whmp.put(key1, "Ganu");
		whmp.put(key2, "Manu");
		
		System.out.println(whmp);
		
		key1=null;
		System.gc();
		System.out.println(whmp);
	}

}
