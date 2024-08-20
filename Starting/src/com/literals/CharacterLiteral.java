package com.literals;

public class CharacterLiteral {
	public static void main(String[] args) {
		char a='A';										 	 //ways [1]
		System.out.println(a);//A
		char b=98;						//char for Character		[2]
		System.out.println(b);//b
		int c='C';					//integer for ASCII value		[3]
		System.out.println(c);//67
		System.out.println('\u0043');//C		//hexadecimal			[4]
		char d='D';
		char e='E';
		System.out.println(d+e);  //137				//becomes integer
		System.out.println(d+" "+e);  //D E 
		int x = 'A'; 
	    int y = 'B';
	    System.out.println(x+y); 				//131
		System.out.println('A' + 'B'); 			//131
		System.out.println('A');  				//A
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.SIZE);
	}

}
