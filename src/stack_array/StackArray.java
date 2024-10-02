package stack_array;

public class StackArray {
	
	//---------------- stack implementation using array ---------------------//
	 
	int arr[];
	int top;
	int size;
	
	public StackArray(int n) {
		
		arr = new int[n];
		top = -1;
		size = n;
	}
	
	public void push(int element) {
		
		if(top >= size-1) {
			System.out.println("Stack is Full - StackOverflow!");
			return;
		}
		top++;
		arr[top] = element;	
	}
	
	public boolean isEmpty() {
		return top <= -1;
	}
	
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;  //just getting value from wrapper class
		}
		return arr[top];
	}
	
	public int pop() {
		
		int val = peek();
		
		if(val != Integer.MIN_VALUE) {
			top--;
		}
		return val;

	}
	
	public boolean isFull() {
		return top == -1;
	}
	
	public void printStack() {
		
		System.out.print("Stack : [");
		
		for(int i = 0 ; i <= top; i++ ) {
			System.out.print(arr[i]);
			if(i != top) {
				System.out.print(",");
			}
		}
		
		System.out.print("]");
	}
	
	
	
	public static void main(String[] args) {
		int n = 5;
		StackArray s = new StackArray(n);
		
		s.push(5);
		s.push(7);
		System.out.println("top :"+s.peek());
		System.out.println(s.pop());
		s.printStack();
		
	}
}
