package com.var_args;

public class VarArgs {
public static void main(String[] args) {
	//var-args variable argument can hold 0 to n no. of arguments of SAME TYPE
	//different type by using OBJECT class
	//printing
	Test t=new Test();
	t.acceptData(1,2,3,4,5);
	t.acceptData(23,4,5,6,665,7,8);
	t.acceptData(65,6,7,9,0,7,755,44);
	//adding
	AddParameters add=new AddParameters();
	add.acceptData(1,2,3,4,5);
	add.acceptData(23,4,5,6,665,7,8);
	add.acceptData(65,6,7,9,0,7,755,44);
	//hetrogeneous
	new Hetrogeneous().hetrogeneous(12,45.655,'A','B',"saikarthik2555@gmail.com",true,false,0,1,2,232434.4242,232.3232,3.23);
	
}
}
