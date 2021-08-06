package day26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("ganu");
		list.add(200);
		list.add(new Frd());
		
		System.out.println("\nPrint list with Normal For loop");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\nPrint list with new For loop");
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		System.out.println("\nPrint list with Iterator class");
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("\nPrint list with ListIterator class");
		
		ListIterator listiter = list.listIterator();
		
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
}
}

class Frd{
	
}