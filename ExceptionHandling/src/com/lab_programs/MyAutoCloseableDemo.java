package com.lab_programs;

public class MyAutoCloseableDemo implements AutoCloseable  {

	@Override
	public void close() throws Exception {
		System.out.println(" ");
	}
	public void display(String str) {
		if(str==null) {
			throw new NullPointerException();
		}
		else {
			System.out.println("I dont have any Exceptions ");
		}
	}
	public static void main(String[] args) {
		MyAutoCloseableDemo d=null;

			try(d){
			
				d.display("gyf");
				
			}
				catch(Exception e)
			{
					System.out.println(e);
				}
		
		}
	

}
