package com.strings;

public class UsingNewKeyword {
	public static void main(String[] args) {
		String str4=new String("Hyderabad"); 
		//String created by new keyword
		String str5="Hyderabad";
		String str6="Hyderabad";
		System.out.println(str4.hashCode()+" "+str5.hashCode()); //same hashcode
//same hashcode because first jvm will search scp if the new String Object is pre-existing
//if  yes assign with new referene variable by Using 
		//Intern Process
		System.out.println(str4.hashCode()==str5.hashCode());//true
		System.out.println(str4==str5);//content wise false
		System.out.println(str5==str6);//String of both scp
//Intern method explicitly loading the 
//String Object created by new keyword into scp
		str4=str4.intern();
		System.out.println(str4==str5);
	}
}
//-----------> intern process ensures that ALL strings having same content must represnt same memory
//address.That is the reasons all strings of same content having same hashcode   <-----------------
