package methods;

import java.util.Scanner;

public class CloneDemo {
	int a;
	Scanner sc;
	public static void main(String[] args) {
		new CloneDemo().a=12;
//		sc=new Scanner(System.in);
		
		new CloneDemo().getClone();
	}
	public void getClone() {
		Solution s=(Solution)new Solution().clone();	//must Override doubt
		System.out.println(s);	
		new CloneDemo().toString();
	}
}

class Solution extends Object{
	
	@Override
	public Object clone() {	
		return new Solution();
	}
}