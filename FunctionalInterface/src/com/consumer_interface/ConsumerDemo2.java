package com.consumer_interface;

import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String[] args) {
//		Consumer<Customer> c1=new Consumer<Customer>() {		//Anonymous approach
//			@Override
//			public void accept(Customer t) {
//				System.out.println(t.getId());
//				System.out.println(t.getName());
//			}
//		};
//		c1.accept(new Customer(12,"sai karthik"));
		
		Consumer<Customer> c1=cust-> {
			System.out.println(cust.getId());
			System.out.println(cust.getName());
		};
		c1.accept(new Customer(12, "sai karthik"));
	}
		
}
