package com.copy_constructor;

public class SameClassObject {
public static void main(String[] args) {
	Player p1=new Player("Virat", "Rohit");
	System.out.println(p1);
	Player p2=new Player(p1);
	System.out.println(p2);
}
}
