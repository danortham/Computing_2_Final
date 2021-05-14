import java.util.*;
import java.io.*;
public class BinaryTree{

    ListNode head;
    Node root;
    
    // function to put node in linked list
    public void push(Person p){

        ListNode newNode = new ListNode(p);

        newNode.next = head;
        head = newNode;
    } // end push


    // convert the linked list to a binary tree
    public Node convertTree(Node n){
        // queue to store parent nodes
        Queue<Node> q = new LinkedList<Node>();
        
        // base
        if(head == null){
            n = null;
            return null;
        } // end if

        // the first node is always root
        n = new Node(head.p);
        // add node to q
        q.add(n);

        head = head.next;

        // until the linklist is over
        while(head != null){
            // gets the information from the head
            Node parent = q.peek();
            // removes the head from the q
            Node temp = q.poll();
            
            Node leftChild = null;
            Node rightChild = null;
            leftChild = new Node(head.p);
            q.add(leftChild);
            head = head.next;
            if(head != null){
                rightChild = new Node(head.p);
                q.add(rightChild);
                head = head.next;
            }// end if
            parent.left = leftChild; 
            parent.right = rightChild;
        }// end while 
        return n;
    } // end convertree   

    public void preOrder(Node n){
        if (n != null){
            System.out.println(n.p.getInfo());
            preOrder(n.getLeft());
            preOrder(n.getRight());
            
        } // end if
    } // end preOrder


    public void addPeople(){
        // ask for name 
        System.out.println("Please enter a name. ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        // ask for age
        System.out.println("Please enter an age. ");
        Scanner intput = new Scanner(System.in);
        int age = intput.nextInt();
        // use person constructor with name and age 
        Person p = new Person(name, age);
        // push() that person
        push(p);
    }// end addPeople

    public void makeTree(){
        Node n = convertTree(root);
        System.out.println("Here's your famliy tree! ");
        System.out.println();
        preOrder(n);
 


    } // end makeTree


     
    public void binaryMenu(){
        boolean keepGoing = true;
         // make the main menu
        while(keepGoing){
            System.out.println("------------------------------------------------");
             System.out.println("Welcome to Family Tree Simulator! ");
             System.out.println();
             System.out.println("What would you like to do? ");
             System.out.println("1) Add people ");
             System.out.println("2) Make Tree ");
             System.out.println("3) Quit ");
             System.out.println();

             Scanner input = new Scanner(System.in);
             String choice = input.nextLine();
             if(choice.equals("1")){
                 this.addPeople();
             } else if(choice.equals("2")){
                 this.makeTree();
             } else if(choice.equals("3")){
                 System.out.println("Going back to main menu. ");
                 System.out.println();
                 keepGoing = false;
             } else {
                 System.out.println("Please enter a valid number ");
             } // end if
        }// end while
    }// end binaryMenu

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        /*
        Person p1 = new Person("Dave", 19);
        Person p2 = new Person("Jill", 48);
        Person p3 = new Person("Jane", 23);
        Person p4 = new Person("Tom", 75);
        Person p5 = new Person("Dan", 21);
        Person p6 = new Person("Joe", 49);
        tree.push(p1); // end
        tree.push(p2);
        tree.push(p3);
        tree.push(p4);
        tree.push(p5);
        tree.push(p6); // head
        Node n = tree.convertTree(tree.root);

        System.out.println();
        System.out.println("PreOrder traversal");
        tree.preOrder(n);
        System.out.println("PostOrder traversal");
        tree.postOrder(n);
        System.out.println("inOrder traversal");
        tree.inOrder(n);
        */
    
        tree.binaryMenu();
        
    }

}// end class def