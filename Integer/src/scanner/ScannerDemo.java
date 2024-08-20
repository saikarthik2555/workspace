package scanner;

import java.util.*;
//I think string []args is internally using next() because it is also consider space as next argument 
public class ScannerDemo  
{
	public static void main(String [] args)
	{
      Scanner sc = new Scanner(System.in);
	  System.out.print("Enter your Name :");
	  String name =  sc.next(); 						//will read single word	
	  String nameCLA=args[0];
	  System.out.println("Your name is :"+name);
	  System.out.println(nameCLA);
	sc.close();
	}
}
