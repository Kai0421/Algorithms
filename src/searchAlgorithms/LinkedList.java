package searchAlgorithms;

import data.Node;

/***
 * 
 * @author Kai
 *
 */

public class LinkedList {
	
	private Node head, tail;
	
	/**
	 * @description : Loop through the list to find the data
	 * @param data
	 * @return
	 */
	public Node find(int data){
		
		//Check make sure that the list not empty
		if(head != null)	
			while(head.getNextNode() != null) // iterate the list
			{
				//Check the node is empty if it is return 
				if(head.getData() == data) 
					return head;
				else // else get next node 
					head = head.getNextNode();
			}
		
		return null;
	}
	
	/**
	 * @description : Delete a particular node
	 * 
	 	//Scenario 1 : if the targeted node is the head node
		//Scenario 2 : if the targeted node is the tail node
		//Scenario 3 : if the targeted node is somewhere in the middle
	 *
	 * @param data
	 */
	public Node delete(int data){
			

		while(head != null) // iterate the list
		{ 
			//Check the node is empty if it is return 
			if(head.getData() == data) 
				if (head.getNextNode() != null)
				{
					System.out.println("Data Found");
					
					//Scenario 1
					if(head.getPrevNode() == null)
					{
						head = head.getNextNode();
						head.setPrevNode(null);
					}
					else //Scenario 2
					{
						Node nextNode = head.getNextNode();
						head = reSortList(head);
					}

					//Break to remove 1 instance of the node,
					//Remove the break to loop through and remove multiple instances of the node that have the same data value
					break;
				}
				else // Scenario 3
				{
					System.out.println("Data Found");

					//Set the previous node to not link to this targeted Delete node
					head = head.getPrevNode();
					head.setNextNode(null);
				}

			//Check if the next node is null the break.
			if (head.getNextNode() == null)
				break;
			
			// else get next node 
			head = head.getNextNode();
		}

		if (head.getPrevNode() != null)
			head = reversingList(head);

		return head;
	}
	
	/**
	 * @description : Passed in the target delete node, then sort the list
	 * @param node
	 */
	private Node reSortList(Node targetedNode){
		
		// Just to be sure you're not passing in the empty node
		if (targetedNode != null)
		{
			//get the previous node go one node back, then start from there. Calling it currentNode. 
			Node currentNode = targetedNode.getPrevNode(), nextNode = targetedNode.getNextNode();
			
			//currentNode set a new next node, instead of linked to the targeted node, link it to the next Node which is the node after the targeted node
			currentNode.setNextNode(nextNode);

			if(nextNode != null)
			{
				// Set the currentNode node into a prevNode node, cus is to use it later for the new currentNode
				Node prevNode = currentNode;

				//Set the currentNode to the nextNode, this becomes the new currentNode
				currentNode = currentNode.getNextNode();

				//New currentNode is now need to be link to the previous currentNode which is the prevNode
				currentNode.setPrevNode(prevNode);

				//Update the nextNode to a new nextNode
				nextNode = nextNode.getNextNode();
			}
			
			return currentNode; 
		}
		return null;
	}
	
	/**
	 * @description : Reverse to the start of the list for printing out purpose
	 * @param node
	 * @return
	 */
	public Node reversingList(Node node){
		
		if (node != null)
			while(node.getPrevNode() != null)
				node = node.getPrevNode();
		
		return node;
	}
	
	/**
	 * @description : Adding node into the list (Doubly linkedList)
	 * @param data
	 */
	public void add(int data){
		
		//Create a new node then set it to the list 
		Node node = new Node(data), prevNode = null;
		
		//Set head if there isnt a head within the list 
		if (head == null)
		{
			head = node;
			tail = node;
			prevNode = head;
		}
		else // If there is a head exist add the next node to the the tail, then set the tail to the next node.
		{
			tail.setNextNode(node); // current node set the next node 
			prevNode = tail;  // then set the current node to previous node
			tail = node; 	// then set the new node as current node
			tail.setPrevNode(prevNode); // set the new current node's previous node as the prevNode. 
		}
 	}
	
	public int listCount(){
		int listSize = 0;
		
		//Check if it's head node
		head = reversingList(head);
		
		while(head != null)
		{
			listSize++;
			
			//Break out the loop if the next node is empty
			if(head.getNextNode() == null)
				break;
			
			head = head.getNextNode();
		}
		
		return listSize;
	}
	
	/**
	 *  @description : Print the Linked List
	 */
	public void print(){
		//Check if it's the head Node
		head = reversingList(head);
		
		while (head != null)
		{
			System.out.print(head.getData() + ", \t");
			
			//Break out the loop if the next node is empty
			if(head.getNextNode() == null)
				break;
			
			head = head.getNextNode();
		}
	
		System.out.println("\nSize of the List : " + listCount());
	}
}