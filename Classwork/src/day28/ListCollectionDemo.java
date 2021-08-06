package day28;

//Arraylist

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ListCollectionDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Barath");
		list.add("Ganu");
		list.add("Velr");
		list.add("Murugan");
		
		if (list.contains("Murugan")) {
			System.out.println("Murugan is there");
		}
		
		System.out.println(list.size());
		System.out.println(list.indexOf("Murugan"));		
		
	}

}
