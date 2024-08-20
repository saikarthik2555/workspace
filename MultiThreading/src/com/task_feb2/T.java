package com.task_feb2;
//...........................................................................................
public class T extends Thread
{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		T nit = new T();
		for(int i=0;i<10;i++)
		{
			nit.start();		//Exception
			//start can call run only one time of one Object
		}
	}
}
//Excecute Every one you get idea
//...............................................................................................
//public class T implements Runnable
//{
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getId());
//	}
//	public static void main(String[] args) {
//		T nit = new T();
//		for(int i=0;i<10;i++)
//		{
//			nit.run();
//		}
//	}
//}
//..................................................................................
//public class T extends Thread
//{
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getName());
//		
//	}
//	public static void main(String[] args) {
//		T nit = new T();
//		for(int i=0;i<10;i++)
//		{
//			nit.run();
//		}
//	}
//}
//...........................................................................................
//public class T implements Runnable
//{
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getId());
//	}
//	public static void main(String[] args) {
//		T nit = new T();
//		for(int i=0;i<10;i++)
//		{
//			nit.run();
//		}
//	}
//}