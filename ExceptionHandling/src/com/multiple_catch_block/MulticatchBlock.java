package com.multiple_catch_block;

public class MulticatchBlock {
	public static void main(String[] args) {
		try {
			System.out.println(10/6);
			
			int arr[]= {12,34,5}; 			//[1]
			System.out.println(arr[2]);
			String s=null;					//[2]
			System.out.println(s.length());
		}
		catch(ArrayStoreException e) {
			System.out.println("Array can store its correspoinding elements");
		}
		catch(NullPointerException e) {
			System.out.println(" [3] Please Assign value to null");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot print beyond size of array");
		}
		catch(ArithmeticException e) {
			System.out.println("Number cannot be divisibe by zero");
		}
		catch(Exception e) {
			System.out.println("Contact developer");
		}
		
	}

}
