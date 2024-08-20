package com.static_method;

interface Calculation{
	public static int sum(int x,int y){
		return x+y;
	}
	public static int sub(int x,int y) {
		return x-y;
	}
	public static int mul(int x,int y) {
		return x*y;
	}
}
public class StaticDemo implements Calculation {
	public static void main(String[] args) {
		int sum=Calculation.sum(12,23);
		int sub=Calculation.sub(125, 87);
		int mul=Calculation.mul(7,7);
		System.out.println(sum+" "+sub+" "+mul);
	}

}
