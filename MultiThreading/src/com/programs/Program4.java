package com.programs;
class MyDataa extends Thread
{
private boolean request;
private String  data;
public void run()
	{
		storeMessage("Hello");
		String str=retrieveMessage();
		System.out.println(str);
	}
public synchronized void storeMessage(String data) 
  {
      request = true;
      this.data = data;
  }

  public synchronized String retrieveMessage() 
  {
    request = false;
    return data+" : "+request;
  }
 }
public class Program4
{
	public static void main(String[] args) 
	{
		MyDataa md = new MyDataa();
		md.start();
        	
		
	}
}
