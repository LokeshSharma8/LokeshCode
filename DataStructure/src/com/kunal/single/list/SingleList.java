package com.kunal.single.list;

public class SingleList {

	Node start=null;
	
	public void addItemAtFront(int item) {
		
		Node node=new Node(item,null);
		
		if(start==null) {
			start=node;
		}else {
			node.addr=start;
			start=node;
		}
	
	}
	
public void addItemAtMiddle(int position,int item) {
		
		Node node=new Node(item,null);
		Node temp;
		int count=1;
		
		if(start==null ) {
			System.out.println(" As of now link list does not exist..."
					+ "Add Element @ Middle can not be used."
					+ " Please use add@Front or add@end option");
		}else {
			temp=start;
			while(count!=position && temp.addr!=null) {
				temp=temp.addr;
				count++;
			}
			
			if(position>count) {
				System.out.println(" OutofRange position entered... ");
			}else {
				
				node.addr=temp.addr;
				temp.addr=node;
				
			}
		}
		
		
		
	}
	
	
	public void addItemAtEnd(int item) {
		
		Node node=new Node(item,null);
		Node temp;
		
		if(start==null) {
			start=node;
		}else {
			temp=start;
			while(temp.addr!=null) {
				temp=temp.addr;
			}
			
			temp.addr=node;
		}
		
	}
	
	public void deleteNodeFromFront() {
		
		if(start==null) {
			
			System.out.println(" List is empty ...can't delete node ");
			
		}else {
			System.out.println(" Node delete "+start.data);
			start=start.addr;
		}
	}
	
	public void deleteNodeFromEnd() {

		Node temp;
		Node beforetemp=null;
		if(start==null) {
			
			System.out.println(" List is empty ...can't delete node ");
			
		}else {
			temp=start;
			while(temp.addr!=null) {
				beforetemp=temp;
				temp=temp.addr;
			}
			System.out.println("Node deleted -> "+temp.data);
			if(start==temp) {
				temp=null;
				start=null;
			}else {
				beforetemp.addr=null;
			}
			
			
		}
	}
	
	public void display() {
		Node temp=start;
		
		if(temp==null)  {
			System.out.println(" No more element to display ....");
		}else {
			
			do {
				System.out.print(temp.data+" -> ");
				temp=temp.addr;
			}while(temp!=null);
			
			System.out.println(" null ");
		}
			
		//	System.out.println();
	}
	
	public void searchElement(int item) {
		
		Node temp=start;
		boolean flag=false;
		int count=0;
		if(start==null) {
			System.out.println(" Linked List is Empty... Can't search item "+item);
		}else{
			
			while(temp!=null) {
				
				count++;
				if(temp.data==item) {
					flag=true;
					break;
				}
				temp=temp.addr;
			}
		}
		
		if(flag==true) {
			System.out.println(item+" -found @ position "+count);
		}else {
			System.out.println(item+" is not present in the list ...");
		}
	}
	
	
	
	
		
}


class Node{
	
	int data;
	Node addr;
	
	Node(int data,Node addr){
		this.data=data;
		this.addr=addr;
	}
}
