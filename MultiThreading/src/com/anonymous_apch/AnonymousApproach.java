package com.anonymous_apch;

public class AnonymousApproach {
	public static void main(String[] args) {
			Thread t1=new Thread() {  //with thread approach
				@Override
				public void run() {
					Thread t=Thread.currentThread();
					t.setName("Child");
					System.out.println(getName());
				}
			};
			t1.start();
//		new Thread() {  //without thread approach
//			@Override
//			public void run() {
//			Thread t=Thread.currentThread();
//			t.setName("Parent");
//				System.out.println(getName());
//			}
//		}.start();
			Thread t=Thread.currentThread();
			t.setName("Parent");
			System.out.println(t.getName());
	}

}
