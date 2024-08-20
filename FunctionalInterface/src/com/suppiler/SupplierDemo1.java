package com.suppiler;

import java.util.function.Supplier;

class Player{
	private int employeeId;
	private String employeeName;

public Player(int employeeId,String employeeName) {
	super();
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	}

@Override
public String toString() {
	return "Player [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}
	

}
public class SupplierDemo1 {
	public static void main(String[] args) {
		Supplier<Player> p1=() -> new Player(111, "raina");
		System.out.println(p1.get());
	}

}
