package com._2mcqs_29dec;

@FunctionalInterface
interface Invisible {
	public void show();
}

class Display implements Invisible {
	Invisible inv;			//has a relation	--> reference variable by default NULL
	public void show() {
		inv = () -> System.out.println("I am Visible");
		;
	}
	//anonymous class
									//Display d=new Display();
//	Invisible inv=() {			//d.inv.show();
//			System.out.println("im visible");
//		}
//	};
//		public void show() {
//		System.out.println("im visible from display");
//	}
}		
public class Program02 {
	public static void main(String[] args) {
       Display d=new Display();
      // d.inv.show();
    
       //d.inv.show();
       d.show();
     d.inv.show();  	
		//new Display().show();	
	}
}
