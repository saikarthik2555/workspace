package com.priority_queue;

import java.util.PriorityQueue;

public class Demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(34);
		pq.add(22);
		pq.add(12);
		pq.add(14);
		pq.add(16);
		pq.add(18);
		pq.add(20);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		pq.add(30);
		pq.add(50);
		System.out.println(pq);
		
	}

}
