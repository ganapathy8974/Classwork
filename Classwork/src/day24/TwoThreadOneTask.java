package day24;

public class TwoThreadOneTask {

	public static void main(String[] args) {
		Canon can = new Canon();
		ShootingTask shoot = new ShootingTask(can);
		
		Thread hulk = new Thread(new ShootingTask(can),"Hulk");
		Thread ganu = new Thread(new ShootingTask(can),"Ganu");
		
		ganu.start();
		hulk.start();
		
	}

}

class ShootingTask implements Runnable{
	Canon can;
	public ShootingTask(Canon can) {
		this.can = can;
	}
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("Ganu")) {
			can.getfill();
		}else if(name.equals("Hulk")) {
			can.getshoot();
		}
		
	}
}

class Canon{
	boolean flag;
	synchronized public void getfill(){
		for(int i=0;i<5;i++) {			
			String name = Thread.currentThread().getName();
			if(flag) {
				try {wait();}catch(Exception e) {}
				
			}
			System.out.println(name + " Fills the Canon...");
			flag = true;
			notify();
		}
	}
	
  synchronized public void getshoot() {
		for(int i=0;i<5;i++) {
			String name = Thread.currentThread().getName();
			
			if(!flag) {
				try {wait();}catch(Exception e) {}
				
			}
			System.out.println(name + " Shoots the Gun....");
			flag=false;
			notify();
		}
	}
}
