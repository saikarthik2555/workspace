package com.hashset;

import java.util.HashSet;

public class HashSetString {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		String s="sunday";
		hs.add(s);
		System.out.println(s.hashCode()+"   "+-(s.hashCode())%16);
		String m="monday";
		hs.add(m);
		System.out.println(m.hashCode()+"   "+m.hashCode()%16);
		String t="tuesday";
		hs.add(t);
		System.out.println(t.hashCode()+"   "+t.hashCode()%16);
		String w="wednesday";
		hs.add(w);
		System.out.println(w.hashCode()+"   "+w.hashCode()%16);
		String th="thursday";
		hs.add(th);
		System.out.println(th.hashCode()+"   "+th.hashCode()%16);
		String h="holiday";
		hs.add(h);
		System.out.println(h.hashCode()+"   "+h.hashCode()%16+"   "+hs.size());
		hs.forEach(str-> System.out.print(str+"   "));
	}
}
