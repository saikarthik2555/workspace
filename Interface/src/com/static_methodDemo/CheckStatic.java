package com.static_methodDemo;

import com.programs_dec23.*;
													//calling static method of different package
import com.programs_dec23.Calculate;
public class CheckStatic {
	public static void main(String[] args) {
		System.out.println(Calculate.doSum(12, 34));
		
	}

}
