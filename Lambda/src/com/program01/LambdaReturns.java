package com.program01;

@FunctionalInterface
interface Length1{
	public abstract int getLength(String str);
}
public class LambdaReturns {
	public static void main(String[] args) {
		Length1 l=new Length1(){
			@Override
			public int getLength(String str){
				
				return str.length();
			}
		};
		int result=l.getLength("india");
		System.out.println(result);
	}

}
