package com.kunal.single.list;

import java.util.Scanner;

public class SingleListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int item=0;
		int position=0;
		Scanner inputFromKeyboard=new Scanner(System.in);
		SingleList list=new SingleList();
		
		while(true) {

			System.out.println(" Choose one of the following ...");
			System.out.println("1.Add @ Front        2.Add @ End        3.Add @ Middle");
			System.out.println("4. Display       ");
			System.out.println("5. Search ");
			System.out.println("6. Delete From Front          7.Delere From End");
			System.out.println("8. Exit");
			int option=Integer.parseInt(inputFromKeyboard.next());
			
			switch(option) {
			case 1:
				System.out.println(" Enter element you want to add ... ");
				item=Integer.parseInt(inputFromKeyboard.next());
				
				list.addItemAtFront(item);
				break;
			case 2:
				System.out.println(" Enter element you want to add ... ");
				item=Integer.parseInt(inputFromKeyboard.next());
				 
				list.addItemAtEnd(item);
				break;
			case 3:
				System.out.println(" Enter Position/spot after which you want add new node");
				position=Integer.parseInt(inputFromKeyboard.next());
				
				System.out.println(" Enter element/item you want to add ... ");
				item=Integer.parseInt(inputFromKeyboard.next());
				
				list.addItemAtMiddle(position,item);
				
				break;
			case 4:
				list.display();
				break;
				
			case 5:
				System.out.println(" Enter element/item you want to search ... ");
				item=Integer.parseInt(inputFromKeyboard.next());
					
				list.searchElement(item);
				break;
			case 6:
				list.deleteNodeFromFront();
				break;
				
			case 7:
				list.deleteNodeFromEnd();
				break;
			case 8: System.exit(0);
			}
			
		}
		
	}

}
