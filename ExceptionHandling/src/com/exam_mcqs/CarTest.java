package com.exam_mcqs;
public class CarTest
{
	static void Stop(String s)throws CarStopped
	{
		try {
			
		
		if(s.equals(s))
		{
			System.out.println(" Car is stop");
		}
		else {
			System.out.println("Car not Stoped");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}
	public static void main(String[] args) throws CarStopped 
	{
		CarStopped s=new CarStopped();
		
		Stop("stop");
		
	}
}
