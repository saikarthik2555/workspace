package com.copy_constructor;

public class Player {
	private String name1;
	private String name2;
	public Player(String name1,String name2) {			//constructor
		this.name1=name1;
		this.name2=name2;
	}
	public Player() {				//no argument
		
	}
	public Player(Player p1) {		//copy constructor
		this.name1=p1.name2;
		this.name2=p1.name1;
	}
	@Override
	public String toString() {
		return "Player [name1=" + name1 + ", name2=" + name2 + "]";
	}
	

}
