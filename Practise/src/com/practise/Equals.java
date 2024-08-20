package com.practise;

public class Equals {
	int id;
	String name;
	public Equals(int id,String name) {
		this.id=id;
		this.name=name;
	}

		@Override
	public boolean equals(Object obj) {
		int eqid1=this.id;
		String eqname1=this.name;
		Equals eq2=(Equals)obj;
		int eqid2=eq2.id;
		String eqname2=eq2.name;
		if(eqid1==eqid2&&eqname1==eqname2) {
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		Equals e1=new Equals(12,"Smith");
		Equals e2=new Equals(12,"Smith");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

}
