package com.list.stack;

import java.util.Stack;

public class Demo1 {

	public static void main(String[] args) {

		Stack s=new Stack();
		//System.out.println(s.empty());
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		
		System.out.println(s);
		System.out.println(s.search("B"));
		System.out.println(s.empty());
		System.out.println(s.pop()); // D
		System.out.println(s); // A B C
		System.out.println(s.peek()); //C
		System.out.println(s); // A B C
		System.out.println(s.search("Z"));
	}

}
/* [A, B, C, D]
3
false
D
[A, B, C]
C
[A, B, C]
-1
*/
