package com.senarioprg_feb14;

import java.util.ArrayList;

public class CabCustomerService {
	private CabCustomer customer;	//has 
	
	private ArrayList<CabCustomer> customerName=new ArrayList<>();
	
	
	public void addCabCustomer(CabCustomer customer) {
		this.customer=customer;
		customerName.add(new CabCustomer(1, "Smith", "Ammerpet", "Secunderabad", 10,"124561238"));
		//isFirstCustomer();
	}
	
	public void isFirstCustomer() {
		for(int i=0;i<customer.getCustId();i++) {
		if(customerName.get!=this.customer.getPhone())
		customerName.add(customer);
		}
	}
	public int calculateBill() {
		if(customer.getCustId()==customerName.get(1)) {
			return 0;
		}
		if(customer.getDistance()<=4) {
			return 80; 
		}else {
			return customer.getDistance()*customer.getDistance()+80;
		}
	}
	public String printBill() {
		return customer.getCustomerName()+" Please pay your bill pf Rs. "+this.calculateBill();
	}
}
