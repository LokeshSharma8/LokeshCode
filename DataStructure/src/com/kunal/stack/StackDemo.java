package com.kunal.stack;

import java.util.Scanner;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int stackSize=0;
		int item=0;
		int popedItem=0;
		System.out.println(" Enter the size of stack ");
		stackSize=Integer.parseInt(input.next());
		
		Stack obj=new Stack();
		obj.initializeStackSize(stackSize);
		
		while(true) {

			
			System.out.println("Choose following options to proceed ...");
			System.out.println("1.Push     2.Pop      3.Exit ");
			int option=Integer.parseInt(input.next());
			
			switch (option) {
			case 1:
				System.out.println(" Please enter the item value to be added to stack ..");
				item = Integer.parseInt(input.next());
				obj.push(item);
				break;
			case 2:
				obj.pop();
										
			case 3:
				System.exit(0);
			}

			
			
			
		}
		
	}

}
