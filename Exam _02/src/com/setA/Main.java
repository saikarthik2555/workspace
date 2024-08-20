package com.setA;

interface Operation{
	public abstract int perform(int a,int b);
}
interface Greeting{
	public abstract void greet(String a,int b);
}
//class B implements Operation{
//
//	
//	
//}
//}

public class Main{
	public static void main(String[] args) {
		//anonymous block
		Operation op=new Operation() {
			@Override
			public int perform(int a, int b) {
				if(a> 0 && b>0) {
					
				return (a*a)+(b*b);
			}
				else {
					return (a+b);
			}
			
		}
		};
		System.out.println(op.perform(4, 3));		//operation
		//anonymous block
	Greeting gre=new Greeting() {
			@Override
			public void greet(String name, int age) {
				if(age>18) {
					System.out.println("The person is Adult");
				}
				else if(name.length()>5 && age<18) {
					System.out.println("The person has a long name and is not an adult");
				}
				
			}
	};
	gre.greet("Virat", 38);				//greeting
	}

}
