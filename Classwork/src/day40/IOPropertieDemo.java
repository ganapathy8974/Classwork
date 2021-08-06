package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class IOPropertieDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
		
		Set set = prop.entrySet();
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());	
		}
	}

}
