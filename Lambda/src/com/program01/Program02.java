package com.program01;

@FunctionalInterface
interface 	Calculator{
	public abstract void doSum(int x,int y);
}

//class Add implements Calculator{
//	@Override 
//	public void doSum(int a,int b) {   [1]
//		System.out.println(a+b);        [2]
//	}
//}

public class Program02 {
	public static void main(String[] args) {
//		Calculator c=new Add();
//		c.doSum(23, 56);						[3]
//	}
//}
	Calculator c=(b,d)->{
		System.out.println("The addition is :"+(b+d));
	};
	c.doSum(23, 56);	
	}
}
