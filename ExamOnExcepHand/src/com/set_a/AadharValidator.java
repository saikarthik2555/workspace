package com.set_a;

public class AadharValidator{
	public static void main(String[] args) throws Exception {
		try {
			System.out.println(validateAadhar("147857621478"));
		}
//		catch (InvalidAadharException e) {
//			System.out.println(e.getMessage());
//		}
		catch (InvalidAadharNumberException e) {
			System.out.println(e.getMessage());
		}
	}		
	public static boolean validateAadhar(String aadharNumber) throws Exception {
	int length=0;
	boolean d=false;
	
//		for(int i=0;i<aadharNumber.length();i++) {
//		if(aadharNumber.charAt(i)>=48 && aadharNumber.charAt(i)<=58) {
//			d=true;
//			}
//		else  { throw new InvalidAadharException("Containing Character");  }
//		}
		
	 if((length+"aadharNumber").length()!=13) {

			throw new InvalidAadharNumberException("Digit Not Match");
			}
		else {
			System.out.println("Valid AadharNumber");
		}
		return true;
	}	
}
class InvalidAadharNumberException extends Exception{		//checked Exception
	public InvalidAadharNumberException() {
	}
	public InvalidAadharNumberException(String message){
		super(message);
	}
	
	class  InvalidAadharException extends Exception{		//checked Exception
		public InvalidAadharException() {
		}
		public InvalidAadharException(String message){
			super(message);
		}
	}
	
}