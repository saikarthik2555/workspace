package com.simple_prgms;
enum Movie 
{
	Pathaan, sir, Hit, Game_over, Lost; 		//public + static + final
}

	public class Program2
	{
	  public static void main(String[] args) 
	  {
	    System.out.println(Program2.getMovie("sir"));
	  }
	  public static Movie getMovie(String s) 
	  {
	    return Movie.valueOf(Movie.class, s);		//movie.enumConstantDirectory(),String s
	  }

	  public static Movie getMovie(int n){
	    return Movie.values()[n];
	  }
}