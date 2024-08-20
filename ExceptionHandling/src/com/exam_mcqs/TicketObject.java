package com.exam_mcqs;

public class TicketObject {
public static void main(String[] args) throws InvalidTicketPriceException {
	Ticket t=new Ticket("Concert", 101, 50);
	System.out.println(t);
	t.setPrice(0);
}
}
