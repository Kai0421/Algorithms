package algorithms;

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
	
	/**
	 * If data < node, traverse left child
	 * If data > node, traverse right child
	 * 
	 *  Can't traverse then add new node.
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
	 * Pass through all the children.
	 */
	public void childTraversing(){
		
		if (rootNode != null)
		{
			Node traverseNode = rootNode;
			
			//Traverse Left Child
			inOrderTraversing(traverseNode);
		}
		
	}
	
	public void inOrderTraversing(Node node){
		
		System.out.println(node.toString());
		
		if (node.getPrevNode() != null)
			inOrderTraversing(node.getPrevNode());

		if (node.getNextNode() != null)
			inOrderTraversing(node.getNextNode());
	}
}