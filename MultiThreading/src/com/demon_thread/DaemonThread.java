package com.demon_thread;
//
public class DaemonThread {
	public static void main(String[] args) {
		Thread d1=new Thread(() ->{ 		//constructor	//Anonymous 
				while(true) {
					System.out.println("Daemon Thread running ");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		d1.setDaemon(true);
		d1.start();		//How it is stopping 
		//running and stopping 
							//while(true)...>infinite but it is stopping
		//run this without userThread.start();
		Thread userThread =new Thread(()->
		{
			for(int i=1;i<9;i++) {
				System.out.println("User Thread "+i);
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		userThread.start();
/* 
Daemon Thread running 
Daemon Thread running 
Daemon Thread running 
Daemon Thread running 
Daemon Thread running 
Daemon Thread running 
Daemon Thread running	
 						*/	
 
}

}
