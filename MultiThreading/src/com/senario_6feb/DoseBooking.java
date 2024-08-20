package com.senario_6feb;

public class DoseBooking{
	private boolean booked;
	public DoseBooking(boolean booked) {
		this.booked=booked;
	}
	public boolean doseBooked() {
		if(booked==true) {
			System.out.println("Dose already Booked");
			Thread.currentThread().interrupt();
		}else { System.out.println("Dose Booked"); 
		booked=true;
		}
		return booked;
//		return Thread.currentThread().isInterrupted(); //
	}
	public boolean isDoseBooked() {
		
		return Thread.currentThread().isInterrupted();//send false if thread is interrupted
	}
}