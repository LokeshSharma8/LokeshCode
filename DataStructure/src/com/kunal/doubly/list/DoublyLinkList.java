package com.kunal.doubly.list;

public class DoublyLinkList {

	Node start=null;
	Node end=null;

	public void addAtFront(int data) {
		
		Node node=new Node(null,data,null);
		
		if(start==null && end==null)
		{
			start=node;
			end=node;
		}else {
			start.prevAddr=node;
			node.nextAddr=start;
			start=node;
		}
	}
	
	public void display() {
		
		Node temp=null;
		
		if(start==null && end==null) {
			System.out.println(" Empty list .... nothing to display ...");
		}else {
		
			temp=start;
			while(temp!=null) {
			
				System.out.print(temp.data+" -> ");
				temp=temp.nextAddr;
			}
			System.out.println(" null ");
		}
	}
	
	
	public  void addAtMiddle(int position , int data) {
		Node node=new Node(null,data, null);
		
		
	}
	
	
}

class Node{
	
	Node prevAddr;
	int data;
	Node nextAddr;
	
	Node(Node prevAddr,int data,Node nextAddr){
		this.prevAddr=prevAddr;
		this.data=data;
		this.nextAddr=nextAddr;
	}
}
