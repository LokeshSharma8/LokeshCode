package com.kunal.tree;

public class Tree {

	Node root=null;
	
	public Node getRoot() {
		return root;
	}
	
	public void insertElementToTree(int data) {
		Node node=new Node(null,data,null);
		
		root=treeLookup(root, node);
	}
	
	public Node treeLookup(Node rootTemp,Node node) {
		
		if(rootTemp==null) {
		     rootTemp=node;
		}else if(node.data<rootTemp.data && rootTemp.left==null){
			 rootTemp.left=node;
		}else if(node.data>rootTemp.data && rootTemp.right==null){
			 rootTemp.right=node;
		}else {
			
			if(node.data<rootTemp.data && rootTemp.left!=null) {
				treeLookup(rootTemp.left, node);
			}else if(node.data>rootTemp.data && rootTemp.right!=null) {
				treeLookup(rootTemp.right, node);
			}
		}
		
		return rootTemp;
	}
	
	public void inOrderTraversal(Node rootTemp) {
		
		if(rootTemp!=null) {
			inOrderTraversal(rootTemp.left);
			System.out.print(rootTemp.data+" ");
			inOrderTraversal(rootTemp.right);
		}
	}
	
	public void preOrderTraversal(Node rootTemp) {
		
		if(rootTemp!=null) {
			
			System.out.print(rootTemp.data+" ");
			preOrderTraversal(rootTemp.left);
			preOrderTraversal(rootTemp.right);
		}
		
	}
	
	
	public void postOrderTraversal(Node rootTemp) {
		
		if(rootTemp!=null) {
			
			postOrderTraversal(rootTemp.left);
			postOrderTraversal(rootTemp.right);
			System.out.print(rootTemp.data+" ");
		}
		
	}
}

class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(Node left,int data,Node right){
		this.left=left;
		this.data=data;
		this.right=right;
	}
}
