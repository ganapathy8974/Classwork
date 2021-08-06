package day22;

public class ThreadDemo1 {

	public static void main(String[] args)throws Exception {
		Thread t = Thread.currentThread();
		t.setName("Ganu");
		t.setPriority(5);
		met();
		System.out.println(t);
		
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
	}
	static void met()throws Exception {
		System.out.println("Method Called.......");
		Thread.sleep(5000);
	}
}
