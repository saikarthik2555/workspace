package com.prg.sealedprgms;

public class Cartoon {
	public static void main(String[] args) {
		DadPig pg=new PebbaPig();				//Parent Deligation
		pg.roll();
								//sealed class inspired from C#
		
		DadPig dg=new DadPig();
		dg.roll();  			//can create object for Sealed Class
	}

}
