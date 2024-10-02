package stack_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue{
	
	//---------------- stack implementation using Queue ---------------------//
	
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	
	public void push(int val) {
		
		while(!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
		q1.offer(val);
		
		while(!q2.isEmpty()) {
			q1.offer(q2.poll());
		}
	}
	
	public int peek() {
		if(q1.isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		return q1.peek();
	}
	
	public int pop() {
		
		if(q1.isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		return q1.poll();
	}
	
	public void printStack() {
		System.out.println(q1);
	}
	     //------- OR ---------//
	
//	public void printStack() {
//		
//		Iterator<Integer> pointer = q1.iterator();
//		System.out.print("[");
//		while(pointer.hasNext()) {
//			System.out.print(" "+pointer.next()+" ");
//		}
//		System.out.print("]");
//	}
	
	
	public static void main(String[] args) {
		
		StackUsingQueue s = new StackUsingQueue();
		
		s.push(4);
		s.push(10);
		System.out.println("top element : "+s.peek());
		s.printStack();
	
	}
	
}
