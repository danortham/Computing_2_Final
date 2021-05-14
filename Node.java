import java.lang.*;

public class Node{
	//node for a linked list
	Person p;
	protected Node left;
	protected Node right;
	
	public Node(Person p, Node left, Node right){
		
		this.left = left;
		this.right = right;
		this.p = p;
	} // end constructor

	public Node(Person p){
		this.p = p;
		left = null;
		right = null;
	} // end constructor

	public void setLeft(Node left){
		this.left = left;
	}
	public Node getLeft(){
		return this.left;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
	public Node getRight(){
		return this.right;
	}	
	
}// end class def
