package day40;

import java.util.ListResourceBundle;
public class Dictionary_hi extends ListResourceBundle{
	Object obj[][]= {
			{"hello","नमस्ते"},
			{"hai","chota namasthe"}
	};
	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return obj;
	}
}