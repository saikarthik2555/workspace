package com.try_with_resourses;

public class TryWithResources1 {
	public static void main(String[] args) {
		Login fb=new Login();
		Welcome w=new Welcome();
		try(w;fb){
		String password=null;
			System.out.println(password.length());
		}catch(Exception e) {
			System.out.println("Cannot be null");			
		}
	}

}
