package com.programs;

public class Clerk extends Employee{
	private int speed;
	private int accuracy;
	private boolean isRaised;
	public Clerk(String name,int employeeId,double salary,int speed, int accuracy) {
		super(name,employeeId,salary);
		this.speed = speed;
		this.accuracy = accuracy;
		setSalary(salary);             
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	@Override
	public void setSalary(double salary) {
		if(this.speed>70 && this.accuracy>80 && isRaised==false) {
		super.setSalary(salary+1000);
		isRaised=true;
	}
		else 
			{
			super.setSalary(salary+0);
			}
		}
	@Override
	public String toString() {
		return super.toString()+"Clerk [speed=" + speed + ", accuracy=" + accuracy + ", isRaised=" + isRaised + "]";
	}
	
}