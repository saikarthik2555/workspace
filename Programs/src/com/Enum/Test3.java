package com.Enum;

public class Test3 {
	enum Season{
		SUMMER,WINTER,SPRING,RAINY;     //objects--> for every object constructor called
		Season(){
			System.out.println("Im constructor ");
		}
		
	}
		public static void main(String[] args) {
			System.out.println(Season.WINTER);
		}
	}
