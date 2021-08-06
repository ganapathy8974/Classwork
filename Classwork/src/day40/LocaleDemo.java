package day40;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		
		System.out.println(locale);
		
		//Locale.setDefault(new Locale("hi"));
		
		//System.out.println(Locale.getDefault());
		
		//ResourceBundle rb=ResourceBundle.getBundle("mydictionary",Locale.getDefault());
		
		ResourceBundle rb=ResourceBundle.getBundle("mydictionary",new Locale("ta"));
		System.out.println(rb.getString("hello"));
		
		ResourceBundle rb3=ResourceBundle.getBundle("day40.Dictionary",new Locale("hi"));
		System.out.println(rb3.getString("hello"));
	}
}
