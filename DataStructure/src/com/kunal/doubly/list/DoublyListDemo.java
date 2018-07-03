package com.kunal.doubly.list;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class DoublyListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkList dlist=new DoublyLinkList();
		int exit=0;
		int data=0;
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("1.add   2.Display   3.Exit");
			
			
		
			System.out.println("Enter Element to add ..");
			data=Integer.parseInt(s.next());
			
			dlist.addAtFront(data);
			dlist.display();
			
			System.out.println("Enter 1 to exit ...");
			exit=Integer.parseInt(s.next());
			
			if(exit==1) {
				System.exit(0);
			}
		}
		
	}

}
