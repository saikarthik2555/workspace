package com.Map;

import java.util.HashMap;

public class HashMapDemo {
	int id;
	String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapDemo other = (HashMapDemo) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		HashMap<Integer,String> newmap1 = new HashMap<>();	 
		HashMap<Integer,String> newmap2 = new HashMap<>();	  

		newmap1.put(303, "OCPJP");
		newmap1.put(225, "is");
		newmap1.put(105, "best");
			  
		System.out.println("Values in newmap1: "+ newmap1);

		newmap2.put(442, "Exam");

		newmap2.putAll(newmap1);

		newmap2.forEach((k,v)->System.out.println(k+" : "+v));	

	}

}
