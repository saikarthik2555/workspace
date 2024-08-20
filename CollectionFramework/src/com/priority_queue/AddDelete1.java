package com.priority_queue;

import java.util.PriorityQueue;

public class AddDelete1
{
      public static void main(String[] argv)
      {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(2);
            pq.add(4);          
			pq.add(6);    
            System.out.print(pq.peek() + "gt "); 
            pq.offer(1);
			pq.offer(9);
            pq.add(3);   
			
            System.out.println(pq.remove(1));
            System.out.print(pq.poll() + "c "); 
            if (pq.remove(2)) {
                System.out.print(pq.poll() + " ");}else {
            System.out.println(pq.poll() + "i " + pq.peek()+"  "+pq.poll());
                }
            System.out.println(pq);
	  }
}
