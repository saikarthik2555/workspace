package com.string_buffer;

public class Performance {
	public static void main(String[] args) {
		long startTime =  System.currentTimeMillis();  
		   
	    for(int i=1; i<=1000000; i++)
	    {
	      StringBuffer sb = new StringBuffer(" Java ");
	      sb.append(" technology ");
	    }
	    
	    long endTime =  System.currentTimeMillis();
	    
	    System.out.println("The total time taken by StringBuffer class to execute this loop :"+(endTime-startTime)+" ms");
	    
	    System.out.println(".......................");
	    startTime =  System.currentTimeMillis();  
		   
	    for(int i=1; i<=1000000; i++)
	    {
	      StringBuilder sb = new StringBuilder(" Java ");
	      sb.append(" technology ");
	    }
	    
	    endTime =  System.currentTimeMillis();
	    
	    System.out.println("The total time taken by StringBuilder class to execute this loop :"+(endTime-startTime)+" ms");

	}

}
