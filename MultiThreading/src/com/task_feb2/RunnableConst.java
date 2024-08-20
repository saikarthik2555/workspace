package com.task_feb2;

public class RunnableConst {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			public void run() {
				System.out.println("Im from Runnable");
			}
		});
		t.start();
	}

}
