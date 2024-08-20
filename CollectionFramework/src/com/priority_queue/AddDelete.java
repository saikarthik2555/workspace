package com.priority_queue;

import java.util.PriorityQueue;

public class AddDelete {
	public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("9");     
        pq.add("8");
        pq.add("7");
        System.out.print(pq.peek() + " ");  
        pq.offer("6");      
		pq.offer("5");
        pq.add("3");

        pq.remove("1");    
        System.out.print(pq.poll() + " ");
        if (pq.remove("2"))
            System.out.print(pq.poll() + " ");
        System.out.println(pq.poll() + " " + pq.peek());
		System.out.println(pq); 

	}

}
