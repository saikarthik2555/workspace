package com.practise;

public class InstanceBlock {
	public static void main(String[] args) {
	Answer a=new Answer();		//constructor instance block
		
	}
}
class Solutionss{
	
	public Solutionss() {
		super();
		System.out.println("First");
	}
	{
		System.out.println("Instance welcomes from parent ");
	}
}
class Answer extends Solutionss{
	public Answer() {
		super();
		System.out.println("second");
	}
	{
		System.out.println("Instance welcomes from child");
	}
}