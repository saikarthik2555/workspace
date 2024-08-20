package com.programs;

class MyData extends Thread
{
private boolean request;
private String  data;
public void run()
	{
		storeMessage("Hello");
		String str=retrieveMessage();
		System.out.println(str+data);
	}
public synchronized void storeMessage(String data) 
  {
      request = true;
      this.data = data;
  }

  public synchronized String retrieveMessage() 
  {
    //request = false;
    return "request";
  }
 }
public class Test
{
	public static void main(String[] args) 
	{
		MyData md = new MyData();
		md.start();
        	
		
	}
}
