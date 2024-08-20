package com.mutli_lvel;

class Student
{
	protected int rollNumber;
	protected String studentName;
	protected String studentAddress;
}
class Science extends Student
{
	private  int physics, chemistry;

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getChemistry() {
		return chemistry;
	}
	
	
}

class MPC extends Science
{
	int maths;
    
	public MPC(int sno, String sname, String addr, int phy, int che, int math)
	{
		super.setPhysics(phy);
		super.setChemistry(che);
		rollNumber = sno;
		studentName = sname;
		studentAddress = addr;
		
		maths = math;
	}

	@Override
	public String toString() 
	{
		return "PCM [maths=" + maths + ", physics=" + super.getPhysics() + ", chemistry=" + super.getChemistry() + ", rollNumber="
				+ rollNumber + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}	
}

public class MultiLevel 
{
	public static void main(String[] args) 
	{
		MPC stu1=new MPC(12, "sai", "Medipally", 78, 67, 89);
		System.out.println(stu1);
	}
}