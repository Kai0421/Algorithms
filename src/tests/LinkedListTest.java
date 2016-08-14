package tests;

import org.junit.Test;
import org.junit.runners.JUnit4;

import algorithms.LinkedList;
import data.Node;

/**
 * 
 * @author Kai
 *
 */

public class LinkedListTest {
	
	private LinkedList list;
	@Test
	public void addTest(){
		list = new LinkedList();
		
		list.add(1);
		list.add(10);
		list.add(120);
		list.add(11);
		list.add(12);
		list.add(13);
	}
	
	@Test 
	public void findTest(){
		System.out.println("\nFind Test : ");
		addTest();
		
		Node node = list.find(11);
		
		if(node == null)
			System.out.println("Node such node in the list");
		else
			System.out.println("Node : " + node.toString());
	}

	@Test
	/**
	 * Delete the first node in the list
	 */
	public void deleteHeadNodeTest(){
		System.out.println("\ndeleteHeadNodeTest : ");
		
		addTest();
		list.delete(1);
		list.print();
	}
	
	@Test
	/**
	 * Delete the middle node in the list
	 */
	public void deleteMiddleNodeTest(){
		System.out.println("\ndeleteMiddleNodeTest : ");
		
		addTest();
		list.delete(11);
		list.print();
	}
	
	@Test
	/**
	 * Delete the Tail node in the list
	 */
	public void deleteTailNodeTest(){
		System.out.println("\ndeleteTailNodeTest : ");
		
		addTest();
		list.delete(13);
		list.print();
	}
}