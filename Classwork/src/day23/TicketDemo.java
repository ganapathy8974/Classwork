package day23;

public class TicketDemo {

	public static void main(String[] args) {
		TicketBookingCounter counter = new TicketBookingCounter();
		
		Thread hulk = new Thread(new TicketBookingJob(counter, 500),"Hulk");
		Thread barath = new Thread(new TicketBookingJob(counter, 1000),"Barath");
				
			hulk.start();
			barath.start();
				
	}

}

class TicketBookingJob implements Runnable{
	TicketBookingCounter tb; int amt;
	public TicketBookingJob(TicketBookingCounter tb, int amt) {
		this.tb = tb;
		this.amt = amt;
	}
	@Override
	public void run() {		
		synchronized (tb) {
			tb.getTicket(amt);
			tb.getChange();
		}
				
	}
}

class TicketBookingCounter{
	int amt;	
	public void getTicket(int amt){
		this.amt = amt;
		Thread t = Thread.currentThread();
		String name =t.getName();
		System.out.println(name+" Got Ticket.");
		System.out.println(name+" Giving "+amt);
	}
	public void getChange() {
		Thread t = Thread.currentThread();
		String name =t.getName();
		System.out.println(name+" Get change "+amt);
	}
}
