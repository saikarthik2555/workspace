package com.var_args;

public class ObjType {
	public void setData(Object ...x) {
		
		for(Object y:x) {
			System.out.print(y);
		}
	}
	public static void main(String[] args) {
		ObjType obj=new ObjType();
		obj.setData(12,34,344.45,04.44);
		obj.setData("sai ","karthik","B");
		obj.setData("!@@##3##");
	}
}