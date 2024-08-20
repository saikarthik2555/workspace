package com.lab_programs;

public class HandleNullPointerException {
	
	public void display(int a,int b) {
		System.out.println("Display method :"+a+" "+b);
	}
	public static void main(String[] args) {
		HandleNullPointerException h=new HandleNullPointerException();
		HandleNullPointerException h1=new HandleNullPointerException();
		h1.display(23, 56);  
		h=null;
		//h.display(12,45);							//Error
		if(h==null) {
			h=new HandleNullPointerException();
			h.display(12, 45);						//pointing
		}
		else {
			h.display(12, 45);
		}
	}

	
}
