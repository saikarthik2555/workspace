package map_practise;

import java.util.HashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws Exception{
		HashMap<Test,String> wm=new HashMap<Test,String>();
		Test t=new Test();
		Test t1=new Test(12, "sai");
		wm.put(t, "one");
		wm.put(t1, "two");
		System.out.println(wm);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(wm);
	}
}
