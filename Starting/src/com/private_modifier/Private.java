package com.private_modifier;
//import com.private_modifier.*;		//import
import com.practise.Tables;					//from another package
public class Private extends Tables{		//protected accessibility...
	public static void main(String[] args) {
		Private p=new Private();		//inheritance
		System.out.println(p.name);
		
	}

}
