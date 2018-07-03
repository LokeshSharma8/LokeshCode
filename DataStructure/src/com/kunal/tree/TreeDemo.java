package com.kunal.tree;

import java.util.Scanner;

import com.kunal.doubly.list.DoublyLinkList;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree=new Tree();
		int exit=0;
		int data=0;
		Scanner s=new Scanner(System.in);
		while(true) {
		
			System.out.println("Enter Element to add ..");
			data=Integer.parseInt(s.next());
			
			tree.insertElementToTree(data);
			
			System.out.println(" ----- InOrderTraversal --------");
			tree.inOrderTraversal(tree.getRoot());
			
			System.out.println();
			System.out.println(" ----- PreOrderTraversal -------");
			tree.preOrderTraversal(tree.getRoot());

			System.out.println();
			System.out.println(" ------ PostOrderTraversal ------ ");
			tree.postOrderTraversal(tree.getRoot());
			
			System.out.println("Enter 1 to exit ...");
			exit=Integer.parseInt(s.next());
			
			if(exit==1) {
				System.exit(0);
			}
		
		}
	}

}
