package com.predict_interface;

import java.util.function.Predicate;

//		W o r k i n G	  // go to this package
//import java.util.function.Predicate; 
public class PredictDemo {


	public static void main(String[] args) {
		Predicate<String> checkName=str -> str.startsWith("R");
		System.out.println(checkName.test("Ravi"));
		
										//public boolean test(Integer num)
		Predicate<Integer> evenOrOdd=num -> num%2==0;
		System.out.println(evenOrOdd.test(8));       //how? how it is accepting Integer
		
									//public boolean test(String str)
		Predicate<String> verifyName= str -> str.equals("Karthik");
		System.out.println(verifyName.test("Karthik"));
		
		
		Predicate<Integer> isEligible=i-> i>18;
		System.out.println("Do he Eligible : "+isEligible.test(23));

	}

}
