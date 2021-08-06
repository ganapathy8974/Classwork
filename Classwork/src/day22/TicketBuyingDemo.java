package day22;
//Uncontrolled Thread
public class TicketBuyingDemo {	
		public static void main(String[] args) {
			Thread t = Thread.currentThread();
			t.setName("Ganu");
			String name = t.getName();
			System.out.println(name+ " Starts the Tickert Counter");
			TicketCounter counter = new TicketCounter();
			
			Thread hulk = new Thread(new JobToCollectTicket(counter, 1000),"Hulk");
			Thread Barath = new Thread(new JobToCollectTicket(counter, 500),"Barath");
			
			hulk.start();
			Barath.start();
		}
}

class JobToCollectTicket implements Runnable{
	TicketCounter jct; 
	int amt;
	public JobToCollectTicket(TicketCounter jct, int amt) {
		this.jct = jct;
		this.amt = amt;
	}
	
	public void run() {
		jct.getTicket(amt);		
		
	}
}

class TicketCounter{	
	public void getTicket(int amount) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+" Got the Ticket.");
		getChange(amount);
	}
	
	public void getChange(int amount) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+" Give "+amount);
		System.out.println(name+" Got change "+ (amount-100));
	}
}