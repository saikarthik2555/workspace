package com.record_mcqs;
class Testt {
	String name;
	public Testt() {
		
	}
	public Testt(String str) {
		
	}
	@Override
	public String toString() {
		return "Testt [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Testt other = (Testt) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
}

public class Equals {
	public static void main(String[] args) {
	Testt t1=new Testt("sunday");
	Testt t2=new Testt("sunday");
	System.out.println(t1.equals(t2));
	
	}

}
