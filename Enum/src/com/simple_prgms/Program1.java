package com.simple_prgms;

public class Program1 extends Object{
	public static void main(String[] args) {
		System.out.println(Direction.EAST);
		Direction s=Direction.SOUTH;
		
//		Direction d=Direction.EAST;
	}
}
enum Direction{
	SOUTH(){
		public void getData() {						//how to access
			System.out.println("skhfhf");
		}
		
		@Override
		public String toString() {
			return "asadf";
		}
	},NORTH(){
		
	},EAST(){
		
	},WEST;
	Direction(){
		System.out.println("Constructor ");
		
	}
	static{
		System.out.println("static block");
		
	}
	{
		System.out.println(" instance block"); 			//1 because instance block is a 
	}												//part of Object and instance block& instance methods
}												//are part of Objects