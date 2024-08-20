package com.senario_6feb;

public class CoronavaccineApp {
	public static void main(String[] args) throws InterruptedException {
//		VaccineEligibility v=new VaccineEligibility(32 , true);
		User u1=new User("Smith", 10, true);
		User u2=new User("Miller",17,false);
	
		Runnable r1=new Runnable() {
			public void run() {
				if(u1.isEligible()) {
					if(u1.doseBooked()) {
						System.out.println("Mask and Aadhar card is Mandatory ");
					}else {
						System.out.println("Only 1 vaccine for a person");
					}
			}else {
				System.out.println("Not Eligible");
			}
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		t1.join();
		t1.interrupt();
		//t1.start();//exception
		
		
		
//		Runnable r2=new Runnable() {
//			public void run() {
//				if(u2.isEligible()) {
//					if(u2.doseBooked()) {
//						System.out.println("Mask and Aadhar card is Mandatory ");
//					}else {
//						System.out.println("Only 1 vaccine for a person");
//					}
//			}else {
//				System.out.println("Not Eligible");
//			}
//			}
//		};
//		Thread t2=new Thread(r2);
//		t2.start();
	}

}
