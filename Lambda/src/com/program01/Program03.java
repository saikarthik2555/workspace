package com.program01;

@FunctionalInterface
interface Length
{
	public abstract int getLength(String str);
}

//class Size implements Length{
//	@Override
//	public int getLength(String str) {  [1]
//		return str.length();				[2]
//	}
//}


public class Program03 {
	public static void main(String[] args) {
//		Length l=new Size();
//		System.out.println(l.getLength("India"));		[3]
		Length l= str ->  str.length();
		System.out.println(l.getLength("India"));
	}

}
