package com.practise;

class Student
{
	protected int rollNumber;
	protected String studentName;
	protected String studentAddress;
	public Student(int rollNumber,String studentName,String studentAddress){
	this.rollNumber=rollNumber;
	this.studentName=studentName;
	this.studentAddress=studentAddress;
	}
}
class Science extends Student
{
	protected int physics;
	protected int chemistry;
	public Science(int sno,String sname,String addr,int phy,int che) {
	super(sno,sname,addr);
	this.physics=phy;
	this.chemistry=che;
	}
}

class PCM extends Science
{
	int maths;
    
	public PCM(int sno, String sname, String addr, int phy, int che, int math)
	{
		super(sno,sname,addr,phy,che);
		this.maths=math;
	}

	@Override
	public String toString() 
	{
		return "PCM [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", rollNumber="
				+ rollNumber + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}	
}

abstract class MultiLevel 
{
	public static void main(String[] args)
	{
		PCM p=new PCM(1,"A","Ameerpet",78,89,99);
		System.out.println(p);
	}
}








