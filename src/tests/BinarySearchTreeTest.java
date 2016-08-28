package tests;

import org.junit.Test;

import algorithms.BinarySearchTree;

/**
 * 
 * @author Kai
 *
 */
public class BinarySearchTreeTest {

	@Test
	public void addNodeToTree(){
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
		
		bst.childTraversing();
	}
}
