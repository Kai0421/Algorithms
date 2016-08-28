package data;

/***
 * 
 * @author Kai
 *
 */

public class Node {
	private int data;
	
	//nextNode also = RightChild, PrevNode = LeftChild for Binary Tree
	private Node nextNode, prevNode;
	
	public Node(int data){
		setData(data);
	}

	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNextNode(Node node){
		this.nextNode = node;
	}
	
	public Node getNextNode(){
		return nextNode;
	}
	
	public void setPrevNode(Node node){
		this.prevNode = node;
	}
	
	public Node getPrevNode(){
		return prevNode;
	}
	
	public String toString(){
		return data + "";
	}
}