package com.exam_mcqs;

public class Ticket {
	private String eventName;
	private int seatNumber;
	private double price;

	public Ticket(String eventName, int seatNumber, int price) {
		super();
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws InvalidTicketPriceException {
		this.price = price;
		if (this.price <= 0) {
			throw new InvalidTicketPriceException("Price must not be zero ");
		} else {
			System.out.println("Price is :"+price);
		}
	}
	@Override
	public String toString() {
		return "Ticket [eventName=" + eventName + ", seatNumber=" + seatNumber + ", price=" + price + "]";
	}
}
class InvalidTicketPriceException extends Exception {
	public InvalidTicketPriceException() {
	}

	public InvalidTicketPriceException(String message) {
		super(message);
	}
}


