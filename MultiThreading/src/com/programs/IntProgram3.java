package com.programs;
class Job extends Thread{
	private Integer number=0;//private are accssible through getter and setter
	public void run() {
		for(int i=0;i<1000000;i++) {
			number++;
		}
	}
	public Integer getNumber() {
		return number;
	}
}

public class IntProgram3 {
	public static void main(String[] args) {
		Job t=new Job();
		t.start();
		try {
			t.sleep(1000);
		}
		catch(Exception e) {
			
		}
		System.out.println(t.getNumber());
		System.out.println("Main ended");
	}

}
