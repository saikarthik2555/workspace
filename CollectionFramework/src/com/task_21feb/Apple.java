package com.task_21feb;

public class Apple {
	private int id;
	public Apple(int id) {
		this.id=id;
	}
	
	
	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Apple [id=" + id + "]";
	}
	

}
