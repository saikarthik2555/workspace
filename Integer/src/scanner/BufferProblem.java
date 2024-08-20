package scanner;

import java.util.Scanner;

public class BufferProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("name");
		String name=sc.nextLine();
		System.out.println(id+" "+name);
	}

}
