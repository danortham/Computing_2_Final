import java.util.*;
import java.lang.*;
public class Tree {
	
	
	Node head = null;

   public static void main(String[] args){
	Tree t = new Tree();   
	t.sampleMenu();

   }
   
   public Tree(){
	   buildSample();

   }
   
   public void buildSample(){
	   // create the people
	   Person p1 = new Person("Dave", 19);
	   Person p2 = new Person("Jill", 48);
	   Person p3 = new Person("Jane", 23);
	   Person p4 = new Person("Tom", 75);
	   Person p5 = new Person("Dan", 21);
	   Person p6 = new Person("Joe", 49);
	   Person p7 = new Person("Dana", 21);

	   // create the nodes
	   Node one = new Node(p1, null, null);
	   Node three = new Node(p3, null, null);
	   Node two = new Node(p2, one, three);
	   Node five = new Node(p5, null, null);
	   Node seven = new Node(p7, null, null);
	   Node six = new Node(p6, five, seven);
	   Node four = new Node(p4, two, six);

	   head = four;
   } // end build sample

   public void preOrder(Node n){
	   if (n != null){
		   System.out.println(n.p.getInfo());
		   
		   preOrder(n.getLeft());
		   preOrder(n.getRight());
	   } // end if
   } // end preOrder
   

   public void sampleMenu(){
		boolean keepGoing = true;
	// make the sample menu
   		while(keepGoing){
			System.out.println("---------------------------------------------------");
			System.out.println("Sample Menu! ");
			System.out.println();
			System.out.println("What would you like to do? ");
			System.out.println("1) Print out the Family Tree ");
			System.out.println("2) Print out children ");
			System.out.println("3) Quit ");
			Scanner input = new Scanner(System.in);
			String choice = input.nextLine();
			if(choice.equals("1")){
				preOrder(head);
			} else if(choice.equals("2")) {
				printKids(head);
			} else if(choice.equals("3")){
				keepGoing = false;
			} else {
				System.out.println("Please enter a valid number ");
			} // end if
	   }
   }
   // return a boolean if the node is a leaf or not
   private boolean isLeaf(Node n)
   {
	   return n.getLeft() == null && n.getRight() == null;
   }
   // if the node is a leaf print out info
   public void printKids(Node n){
	 	if(n != null){
	 		printKids(n.getLeft());
	 		if( isLeaf(n) ){
	 			System.out.println(n.p.getInfo());
	 		}
	 		printKids(n.getRight());
	 	} // end if
	 }// end printKids

}// end class def