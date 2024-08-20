package com.july.practise.hierarchical;

public class VarargsProgram {
public static void main(String[] args) {
	Test t=new Test();
			t.obj("12");
//			t.obj(34);
//			t.obj("smith");
//			t.obj("1222111213");
//			t.obj('d');
//			t.get(1234);
//			t.get(12);
	
	}
}
class Test{
	public void  obj(Object ...add) {
		for(Object obj: add) {
			System.out.println(obj);
		}
	}
	
	public void get(byte b) {
		
	}
	public void get(short s) {
		
	}
//	public void get(int no) {
//		
//	}
	
}