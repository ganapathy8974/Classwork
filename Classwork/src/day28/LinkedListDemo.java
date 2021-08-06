package day28;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
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
