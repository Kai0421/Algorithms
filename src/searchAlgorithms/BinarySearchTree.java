package searchAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

import data.Node;

/**
 * 
 * @author Kai
 *
 */

public class BinarySearchTree {
	
	// Binary tree contain nodes.
	// Node  -- > Key (Data)
	//		 -- > 2 Children: Left Or Right node or No Children 
	
	private Node rootNode;
	private ArrayList<Integer> nodes;// = new ArrayList<>();
	
	/**
	 * @description :  If data < node, traverse left child
	 * 				   If data > node, traverse right child
	 * 
	 * 				   Can't traverse then add new node.
	 * @param data
	 */
	public void add(int data){
		Node node = new Node(data);
		
		if (rootNode == null)
			rootNode = node;
		
		//Traverse and add new node (recursive call)
		traversingProcess(rootNode, node);
	}
	
	/**
	 *   
	 * @param node
	 * @param addNewNode
	 * @return
	 */
	private void traversingProcess(Node node, Node addNewNode){
		
		//Go to Left Leaf Node (Left Child Node)
		if (addNewNode.getData() < node.getData())
			if (node.getPrevNode() == null)
				node.setPrevNode(addNewNode);
			else
				traversingProcess(node.getPrevNode(), addNewNode);
		
		else if (addNewNode.getData() > node.getData())
			if (node.getNextNode() == null)
				node.setNextNode(addNewNode);
			else
				traversingProcess(node.getNextNode(), addNewNode);
	}
	
	/**
	 * @description : Pass through all the children.
	 * @param treeBalancing
	 */
	public void childTraversing(boolean treeBalancing){
		
		if (rootNode != null)
		{
			Node traverseNode = rootNode;
			
			//Traverse Left Child
			inOrderTraversing(traverseNode, treeBalancing);
		}
	}
	
	/**
	 * 
	 * @param node
	 * @param treeBalancing
	 */
	private void inOrderTraversing(Node node, boolean treeBalancing){
		
		System.out.println(node.toString());
		if (treeBalancing)
			nodes.add(node.getData());
		
		if (node.getPrevNode() != null)
			inOrderTraversing(node.getPrevNode(), treeBalancing);

		if (node.getNextNode() != null)
			inOrderTraversing(node.getNextNode(), treeBalancing);
	
	}
	
	/**
	 * @description :  Make the tree to balance : This function does not make a correct Binary Search Tree but
	 * 				   instead is trying to re-elect Root node, * this will give the tree and even number side 
	 * 				   of the leaves node. 
	 */
	public void treeBalancing(){
		
		//Ensure a fresh ArrayList with no element in the arraylist
		nodes = new ArrayList<>();
		
		// To deconstruct the tree first load all data into a list
		treeDeconstruction();
		
		// Then Reconstruct the tree again using the data
		treeReconstruction();
	}
	
	/**
	 * @description :  De-construct the tree by setting the child traversing to true in parameter and the add 
	 * 				   each node into a list
	 * 
	 */
	private void treeDeconstruction(){

		// Loop through the children nodes and put the data into an arraylist
		childTraversing(true);
		
		//Sort the list in ascending order
		Collections.sort(nodes);
		
		//Reset Root Node
		rootNode = null;
	}
	
	/**
	 * @description :  Reconstruct the tree by finding the mid point of the list to create a complete tree with
	 * 				   identical branches each side.
	 * 
	 */
	private void treeReconstruction(){
		
		if (nodes.size() > 0)
		{
			ArrayList<Integer> result = midPointSorting(nodes);
			for(int data : result)
				add(data);
		}
	}
	
	/**
	 * @description :  Sorting according to midpoint
	 * @return
	 */
	private ArrayList<Integer> midPointSorting(ArrayList<Integer> nodes){
		ArrayList<Integer> result = new ArrayList<>();
		
		while (nodes.size() != 1)
		{
			int index = midPoint(nodes);
			result.add(nodes.get(index));
			nodes.remove(index);
		}
		
		//Add the final element
		result.add(nodes.get(0));

		return result;
	}
	
	/**
	 * @description :  Look for the mid point as the parent, if the modulo return 0 which mean is even then 
	 * 				   add 1 to the list.
	 * @param nodes
	 * @return
	 */
	private int midPoint(ArrayList<Integer> nodes){
		if (nodes.size() > 2)
			return (nodes.size() % 2 == 1) ? (nodes.size()/2) : ((nodes.size()/2) + 1);
		else
			return (nodes.size() % 2 == 1) ? (nodes.size()/2) : ((nodes.size()/2));
	}
}