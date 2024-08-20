package com.task_feb;


class TicketDispencer extends Thread{
	private int maxTicket=200;
	private static int allotedSeat;
	static int i;
	public TicketDispencer(int allotedSeat) {  //constructor
		this.allotedSeat=allotedSeat;
	}
	
	public void run() {
		if(maxTicket>=allotedSeat) {
			for( i=1;i<=allotedSeat;i++) {
			System.out.println("Your Seat "+i+" is confirmed "+
					"Remaining seats are "+allotSeatNumber(i));
			}
		}
	}
	public int allotSeatNumber(int i) {
		
		if(allotedSeat==maxTicket) {
			return -1;
		}
		return maxTicket-allotedSeat;
	}
}
public class MovieTicketReservation {
	public static void main(String[] args) throws InterruptedException {
		TicketDispencer t=new TicketDispencer(150);
		t.start();
		t.join();
		TicketDispencer t1=new TicketDispencer(10);
		t1.start();
	}

}
