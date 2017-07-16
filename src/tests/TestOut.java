package tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import searchAlgorithms.BinarySearchTree;

/**
 * 
 * @author Kai
 *
 */
public class TestOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> bst = new ArrayList<>();
//		
//		bst.add(50);
//		bst.add(20);
//		bst.add(60);
//		bst.add(21);
//		bst.add(10);
//		
//		ArrayList<Integer> sortedNode = new ArrayList<>();
//		
//		Collections.sort(bst);
//		
//		bst.remove(3);
//		
//		for (Integer i : bst)
//			System.out.println(i);
//		
//		System.out.println(1%2);
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(50);
		bst.add(25);
		bst.add(75);
		bst.add(10);
		bst.add(80);
		
		bst.add(30);
		bst.add(40);
		bst.add(35);
		bst.add(90);
		bst.add(100);
		
		bst.add(50);
		bst.add(20);
		bst.add(60);
		bst.add(21);
		bst.add(10);
		
		bst.treeBalancing();
		
		System.out.println("\n\n New Line \n\n");
		bst.childTraversing(false);
	}
	
}