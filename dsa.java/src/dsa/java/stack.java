package dsa.java;

public class stack {
	 final  static  int max_size=30;
	 int arr[]=new int [max_size];
	 int top;
	 
	
	stack(){
		 top=-1;
	    
		
		
	}
	
 void push(int val) {
	if(top==max_size-1) 
		throw new IndexOutOfBoundsException("overflow");
	arr[++top]=val;
	
}
 
 int pop() {
	 if(top==-1)
		 throw new IndexOutOfBoundsException("underflow");
	return arr[top--];
 }
	int peek() {
		return arr[top];
	}
	boolean isempty() {
		return top==-1;
	}
 
	

}
