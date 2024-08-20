package com.Enum;

public class Test4 {
	enum Season{
		SUMMER("Unpleasent"),WINTER("pleasent"),RAINY("ok"),SPRING;
		String msg;
		Season(String msg){
			this.msg=msg;
		}
		Season(){
			this.msg="cold";
		}
		public String getData() {
			return this.msg;
		}
	}
	public static void main(String[] args) {
		Season s1[]=Season.values();
		for(Season s:s1) {
			System.out.println(s.getData());
		}
	}

}
