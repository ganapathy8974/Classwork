package day25;
/*
 * String is Create new object for every process you doing with string.
 * So, Java offers the new class "StringBuilder" this class replacing what ever you do anything with string that's apply in the same object
 * so it's saves your memory.
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		String name = "Hello";
		String temp = name;
		name = name+" World";
		
		System.out.println(temp);
		
		StringBuilder s = new StringBuilder("Hello");
		StringBuilder temp1= s;
		s.append("World");
		
		System.out.println(temp1);
	}

}
