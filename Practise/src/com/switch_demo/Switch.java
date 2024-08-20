package com.switch_demo;

public class Switch{
	public static void main(String[] args) {
		Integer a[]= {12,34,56};
		Integer value1=a[1];
		if(value1 instanceof Integer) {
			System.out.println("Yesssss from Integer");
		}
		switch(value1) {
		case 12: System.out.println("Index Zero"); break;
		case 34: System.out.println("Index First");break;
		case 56: System.out.println("Index Second"); break;
		default: System.out.println("Not Found");
		}
		
		Character b[]= {'a','b','c'};
		Character value2=b[2];
		if(value2 instanceof Character) {
			System.out.println("Yesssss from Character");
		}

		switch(value2) {
		case 'a': System.out.println("Index Zero"); break;
		case 'b': System.out.println("Index First");break;
		case 'c': System.out.println("Index Second"); break;
		default: System.out.println("Not Found");
		}
		
		String c[]= {"zero","first","second"};		//String allowed in Switch from jdk 1.5
		String value3=c[0];							//String is an Object
		if(value3 instanceof String) {
			System.out.println("Yesssss from String");
		}
		switch(value3) {
		case "zero": System.out.println("Index Zero"); break;
		case "first": System.out.println("Index First");break;
		case "second": System.out.println("Index Second"); break;
		default: System.out.println("Not Found");
		}
		
		SwitchDemo s=SwitchDemo.FIRST;
		if(s instanceof SwitchDemo) {
			System.out.println("Yesssss from Enum");
		}
		switch(s) {
		case FIRST: System.out.println("FIRST OBJECT"); break;
		case SECOND: System.out.println("SECOND OBJECT");break;
		case THIRD: System.out.println("THIRD OBJECT"); break;
		default: System.out.println("Not Found");
		}
	
	}

}
enum SwitchDemo{
	FIRST,SECOND,THIRD;
}