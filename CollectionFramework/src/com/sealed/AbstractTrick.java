package com.sealed;

public class AbstractTrick {
//throw abstract we cannot create object for super/Parent class
	public static void main(String[] args) {
	//	Super s=new Super();	//error
					
	}
}
sealed abstract class Super permits Child1,Child2{
	
}
non-sealed class Child1 extends Super{
	
}
final class Child2 extends Super{
	
}