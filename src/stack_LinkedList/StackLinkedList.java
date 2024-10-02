package stack_LinkedList;


//---------------- stack implementation using LinkedList ---------------------//

class Node{
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}


public class StackLinkedList {
	
	private Node top;
	
	public StackLinkedList() {
		this.top = null;
	}
	
	public void push(int val) {
		
		Node node = new Node(val);
		node.next = top;
		top = node;
	}
	
	public int pop() {
		
		if(top == null) {
			System.out.println("Stack is Empty..");
			return -1;
		}
		
		int poppedValue = top.data;
		top = top.next;
		
		return poppedValue;
	}
	
	public int peek() {
		
		int peekValue = top.data;
		
		if(top == null) {
			System.out.println("Stack is Empty..");
			return -1;
		}
		
		return peekValue;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void printStack() {
		
		System.out.print("Stack : [");
		
		while(top != null) {
			
			System.out.print(top.data);
			
			if(top.next != null) {
				System.out.print(",");
			}
			top = top.next;
		}
		
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		
		StackLinkedList s = new StackLinkedList();
		
		s.push(10);
		s.push(20);
		s.push(5);
		System.out.println("popped value :" + s.pop());
		System.out.println("top element :"+s.peek());
		
		s.printStack();
		
		
	}

}



