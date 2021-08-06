package day23;

public class FirstThreadDemo {
	public FirstThreadDemo() {
		Thread child = new Thread(new ThreadJob());
		child.start();
	}

	public static void main(String[] args) throws Exception {
		new FirstThreadDemo();
		Thread t = Thread.currentThread();
		System.out.println(t);		
		//Lazy for Loop
		for(int i=0; i<=6;i++) {			
			System.out.println(i);	
			Thread.sleep(1000);
		}

	}

}

class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread Succssfully called.....");
		
	}
}