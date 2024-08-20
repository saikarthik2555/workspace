package com.Enum;

public class Test1 {
	private enum Season{
		WINTER{
	
	@Override
	
	public String toString() {
		return "winter"; 
	}
		},
	SPRING{
		@Override
		public String toString() {
			return "spring";
		}
	}
		}
	public static void main(String []args) {
		System.out.println(Season.WINTER);
	}

}
