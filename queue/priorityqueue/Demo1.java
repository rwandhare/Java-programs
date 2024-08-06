package com.queue.priorityqueue;

import java.util.PriorityQueue;

public class Demo1 {

	public static void main(String[] args) {

		PriorityQueue pq=new PriorityQueue();
		
		pq.offer(10);
		pq.offer(40);
		pq.offer(30);
		pq.offer(20);
		pq.offer(50);
		pq.offer(15);
		
		System.out.println(pq);
	}

}
/*
Output
[10, 20, 15, 40, 50, 30]
*/