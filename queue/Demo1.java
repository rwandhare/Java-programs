package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {

	public static void main(String[] args) {

		Queue q=new PriorityQueue();
		Queue q2=new PriorityQueue();
		
		q.offer("A");
		q.offer("X");
		q.offer("Z");
		q.offer("B");
		
		System.out.println(q);
		System.out.println(q.element()); // A
		System.out.println(q); // A B Z X
		
		System.out.println(q2); 
		System.out.println(q2.element());
	}

}
/*
Output
[A, B, Z, X]
A
[A, B, Z, X]
[]
Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.AbstractQueue.element(AbstractQueue.java:136)
	at Collection/com.queue.Demo1.main(Demo1.java:23)
	
	*/
