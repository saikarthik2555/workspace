package com.autoboxing;
//06-02-24
public class IntegerMethods {
	public static void main(String[] args) {
		//static variables
		System.out.println(Integer.toString(124, 35));
		System.out.println(Integer.toOctalString(124));
		//radix--> parseInt
		//radix--> toString
		//radix--> valueOf
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		//other
		System.out.println(Integer.max(12, 45));
		System.out.println(Integer.min(12, 45));
		System.out.println(Integer.sum(12, 12));
		System.out.println(Integer.compare(24,12));//-1 0 1
		System.out.println(Integer.reverse(11112));			//Doubt
		Integer i=1234567;
		System.out.println(Integer.rotateLeft(i, 2));		//Doubt
		//Number/Decimal to String-->toString()
		System.out.println(Integer.toString(12));//default
		System.out.println(Integer.toString(12, 39));//number,radix
		System.out.println(Integer.toOctalString(12));
		System.out.println(Integer.toHexString(15));
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toUnsignedString(2));
		System.out.println(Integer.toUnsignedString(-2));//unsigned similar to toString if number is positive
		//unsigned used for negative
		System.out.println(Integer.toUnsignedString(12, 2));
		System.out.println(Integer.toUnsignedString(-12,2));//lomng
		int x = 12;
		String str = Integer.toString(x);
		System.out.println(str+2);
		//String to int
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("12",8));   //radix
//Unsigned parse 	
		//System.out.println(Integer.parseUnsignedInt("-123")); //negative Not allowed for Unsigned parseInt
		//System.out.println(Integer.parseUnsignedInt("-123", 8));// "     "           "     "
		
		//integer to Integer Object
		//String to Integer Object
		int a=12;
		Integer b=Integer.valueOf(a);
		System.out.println(b);
		String c="123";  //String object--> Integer object
		Integer d=Integer.valueOf(c);//Possible
		String e="2121";
		Integer f=Integer.parseInt(e, 8);//Radix
		System.out.println(f);
		
		Double q=Double.valueOf(52.23); //double to Double Object
		Double w=Double.parseDouble("45.25");//String to Double
		String r=Double.toString(45.25);//double to string
		System.out.println(".....................");
		Integer s=Integer.valueOf("12",2);	//NumberFormatException  binary cannot save in Integer 
		System.out.println(s);
		//Integer t=Integer.valueOf(15,3);//yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy

		//String str="271";
//		//System.out.println(Integer.parseInt(str, 8));
//		String s=Integer.toString(12,2);
//		int i=Integer.parseUnsignedInt(s,2);
//		System.out.println(i);
//		System.out.println(Integer.toUnsignedString(12, 8));
//		System.out.println(Integer.toString(12, 2));
//		System.out.println(Integer.toUnsignedString(-12, 2));
//		System.out.println(Integer.toString(-12,2));
//		System.out.println(Integer.toUnsignedString(-12));
//		System.out.println(Integer.toString(-12));
//		int a=Integer.parseUnsignedInt("12");
		
	}

}
