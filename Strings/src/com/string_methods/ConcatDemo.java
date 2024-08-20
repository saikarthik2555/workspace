package com.string_methods;

public class ConcatDemo {
	public static void main(String[] args) {
		String str1="Data";
		String str2="Base";
		String str3=str1.concat(str2);
		System.out.println(str3); //DataBase
//internally 
//concat(str2);
		/*public String concat(String str){
		 * return +"str";
		 */
		
		/*str1.concat(str2)
		 * str1+str2
		 * "Data"+"Base";
		 * 
		 */
		System.out.println("Data"+"Base");//DataBase
	}

}
