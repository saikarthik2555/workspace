package serialization;

import java.io.Serializable;
import java.util.Scanner;

public record Employee(int id,String name,double salary) implements Serializable {
	public static Employee getObject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Salary");
		Double salary=sc.nextDouble();
		return new Employee(id,name,salary);
	}
}
