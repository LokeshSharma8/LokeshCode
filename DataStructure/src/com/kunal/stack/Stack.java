package com.kunal.stack;

public class Stack {

	private int stackSize;
	private int top=-1;
	private int[] stack;
	
	
	//Creating stack of size equal to stackSize
	public void initializeStackSize(int stackSize) {
	
		this.stackSize=stackSize;
		stack=new int[stackSize];
	}
	
	//Adding an element to stack 
	public void push(int item) {
		
		if(top==stackSize-1) {
			System.out.println("Stack is Full ... Overflow Occured ..");
			return;
		}
		
		top++;
		stack[top]=item;
	}
	

	//Removing element from the stack
	public void  pop() {
		
	
		if(top==-1) {
			System.out.println("Stack is empty ... Underflow occured .. ");
			return;
		}
		
	    int item=stack[top];
		System.out.println(" Item poped from stack is "+item);	

	    
	    
	    top--;
		
	   
	}
}
