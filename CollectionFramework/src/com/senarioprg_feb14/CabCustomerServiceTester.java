package com.senarioprg_feb14;

public class CabCustomerServiceTester {
	public static void main(String[] args) {
		CabCustomer c1=new CabCustomer(1, "Smith", "Ammerpet", "Secunderabad", 10,"124561238");
		CabCustomerService shift=new CabCustomerService();
		shift.addCabCustomer(c1);
		
		System.out.println(shift.calculateBill());
		
		System.out.println(shift.printBill());
	}

}
