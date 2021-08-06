package day29;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Set;

public class ComparatorDemo {

	public static void main(String[] args) {
		Set<String> tset = new TreeSet<String>(new MyComparator());
		
		tset.add("Ganu");
		tset.add("Manu");
		tset.add("Banu");
		tset.add("Anu");
		
		System.out.println(tset);
		
	}

}

class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}
