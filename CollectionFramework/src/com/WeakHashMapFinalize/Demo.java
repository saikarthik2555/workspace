package com.WeakHashMapFinalize;

import java.util.WeakHashMap;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<Test,String> wm=new WeakHashMap<>();
		Test t1=new Test();
		wm.put(t1, "Raj");
		System.out.println(wm);
		t1=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(wm);
		}
}
class Test{
	@Override
	public String toString(){
		return "Test";
	}
	
	@Override
	public void finalize() {
		System.out.println("If it is eligible this method will invoke");
	}
	
}