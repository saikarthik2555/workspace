package com.record_mcqs;

final record Add(int a,int b) {	
	int show() {
		return a-b;
	}
	public Add{
		if(a>11) {
			System.out.println("a is greater");
		 
		}
	}
	public int gret() {
		return a;
	}
}
	

public class Program1 {
	public static void main(String[] args) {
	Add a=new Add(12,14);
//	System.out.println(a.a()+a.b());
//	System.out.println(a.show()); 			//here show method doesnot invoke
//	
		
	}

}
