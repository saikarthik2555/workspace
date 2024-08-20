package com.lab_programs;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try{
        	System.out.println("Enter your name");
            String name=sc.nextLine();
            if(name!=null){
                throw new NullPointerException("Cannot insert NULL");
            }
            System.out.println(name.length());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
/*public class ArrayIndexOutOfBoundsExceptionDemo1 {
	public void checkException() {
		try {
			int arr[]=new int[50];
			arr[6]=20;
			System.out.println("Element inserted ");
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println(" Entered elements cannot insert in that index");
		}
	}
	
	public static void main(String[] args) {
		ArrayIndexOutOfBoundsExceptionDemo1 d=new ArrayIndexOutOfBoundsExceptionDemo1();
		d.checkException();
		
	}

}
*/
