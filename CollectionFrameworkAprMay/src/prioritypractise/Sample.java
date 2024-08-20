package prioritypractise;

import java.util.PriorityQueue;

public class Sample {
public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<>();

    pq.add("9");  
//added at last . In a queue, insertion is possible from last is called REAR where as deletion is possible from the starting is called FRONT of the queue.
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
    System.out.println(pq.peek()+" "+pq.poll());
	System.out.println(pq); 
	}
}
