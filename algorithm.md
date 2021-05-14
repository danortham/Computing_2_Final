# Final Project

## General Description
> Make a family tree using a binary tree data structure.
> 
> A binary tree is made of nodes and these nodes have a left, right and a person.
> 
> left and right indicate what that node points to. The nodes that are pointed to are the children.
> 
> Person is a class which contains information about each person.
> 
> The user can also create their own family tree.
> 
> The user will be able to add people to a linked list. Once they have added all the people that they want to add
> they can make the tree.
*** 
## Classes
1. Node.java
   * The node for binary tree
   * Each node has a person object, a left and a right
   * The left and the right are both point to other nodes or they can be null
2. Person.java
   * This is a person object
   * each person object has a name and age
3. ListNode.java
   * The node for linked list
   * This node just has a person and next
   * next is a pointer to the next node in the line
4. Tree.java
   * This is the file that has the sample tree in it
   * The functions in this file are:
     * buildSample()
       * Populates all the sample people and puts them into the binary tree.
     * preOrder(Node n)
       * A recursive function that prints out the binrary tree in preOrder tree traversal
     * isLeaf(Node n)
       * recursive function
       * checks each node and if left and right are null then returns a boolean
     * printKids(Node n)
       * recursive function
       * checks each node if it is a leaf and if it is print out person information
     * sampleMenu()
       * A classic menu that prompts the user for inputs and calls the other functions
5. BinaryTree.java
   * Has a listNode head and Node(binary tree) root
   * This was the hardest part of my project by far!
   * There is a menu just like in sample and driver
   * From this menu the user can chose to add a person or make the tree
   * If they try to make the tree without any people in it then it wont return anything
   * First they have to populate the linked list people objects
   * then I use the convertTree function to convert the linked list of people into a binary tree
     * we do this by making the first node the root and the next two nodes are left and right children.
     * I continue this for the rest of the tree.
   * I then print out the tree in preOrder traversal 
   * addPerson()
     * This function asks for the user input then I put all that information into a person constructor
     * After that I push that person into the linked list 
   * makeTree()
     * This is just a function that runs the convertTree function and prints it in preOrder automatically
   * BinaryMenu()
     * Just a classic menu that calls functions  
6. Driver.java
   * Classic driver file
   * has main menu function which is used to direct to the other menus  

*** 

