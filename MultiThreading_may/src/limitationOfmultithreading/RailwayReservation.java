package limitationOfmultithreading;

public class RailwayReservation {
	public static void main(String[] args) {
		Seats s=new Seats(1);
		
	new Thread(s,"cust1").start();
	new Thread(s,"cust2").start();
	}
}
class Seats implements Runnable{
private int availableseats=1;
private int wantedseats;

public Seats(int wantedseats) {
	this.wantedseats=wantedseats;
}
	@Override
	public void run() {
		if(availableseats>=wantedseats) {
			System.out.println("seats booked "+Thread.currentThread().getName());
			availableseats=availableseats-wantedseats;
		}else {
			System.out.println("seat not booked to "+Thread.currentThread().getName());
		}
		
	}
	
}
