/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subtreeproblem;

import java.util.Scanner;


/**
 *
 * @author mayanmishra
 */
public class SubTree {
    static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
                Node root = createTree();
        }

        static Node createTree() {
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data) {};
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;
	}
        
        public Node searchBST(Node root, int val) {
        if(root == null || root.data == val) return root;
        
       
        else if(val < root.data){
            return searchBST(root.left, val);
            
        }
        else if(val > root.data){
            return searchBST(root.right, val);
        }
        return null;
    }
        
        
}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}