package com.mcqs;

@FunctionalInterface
interface Calculate {
	void doSum(int x,int y);

}
//class B implements Calculate{
//
//	@Override
//	public void doSum(int x, int y) { 				[1]
//		System.out.println(x+y);					[2]
//		
//	}									//Normal Class calling Interface
//						too many classes burden for System so we have lambda function
//}
public class IntroductionLambda {
	public static void main(String[] args) {
//		c.doSum(56, 89);  							[3]
		
//---------------------------------------------------------------------------------------------		
					//[1]				//[2]
		Calculate c=(x,y) ->System.out.println(x+y);
	c.doSum(22, 23);		//[3]
		
	}
}
