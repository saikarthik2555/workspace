package com.multi_level;

public class MPC extends Science{
	protected int maths;
	public MPC(int roll,String Name,String Add,int phy,int chem,int math) {
		rollNumber=roll;
		stuName=Name;
		stuAddress=Add;
		physics=phy;
		chemistry=chem;
		maths=math;
	}
	@Override
	public String toString() {
		return "MPC ["+rollNumber+" "+stuName+" "+stuAddress+" "+physics+" "+chemistry+" "+maths+"]";
	}
	
}
