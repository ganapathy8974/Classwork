package day28;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
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