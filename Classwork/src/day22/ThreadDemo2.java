package day22;

import java.util.Date;

public class ThreadDemo2 {

	public static void main(String[] args) {
		VaccinationCenter vc = new VaccinationCenter();		
		Thread hulk = new Thread(new JobToHulk(vc));		
		hulk.setName("Hulk");
		hulk.start();
		System.out.println("I am Start working"+new Date());
	}

}

class JobToHulk implements Runnable{
	VaccinationCenter vc;
	public JobToHulk(VaccinationCenter vc) {
		this.vc=vc;
	}	
	@Override
	public void run() {
		try {
			vc.collect();
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}
}

class VaccinationCenter {
	public void collect() throws Exception{
		System.out.println("I am wait for the Token");
		Thread.sleep(10000);
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+"Got the Token "+new Date());
	}
}
