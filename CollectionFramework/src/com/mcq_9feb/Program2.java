package com.mcq_9feb;
import java.util.*;
import java.util.ArrayList;
public class Program2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Patna");
		list.add(0,"New York");
		list.add(3,"Sydney");//IndexOutOfBoundException
		list.add("Ameerpet");
		System.out.println(list);
	}

}
