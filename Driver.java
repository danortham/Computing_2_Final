import java.util.*;
public class Driver{
    Tree t = new Tree();
    BinaryTree bt = new BinaryTree();

    public static void main(String[] args){
        Driver d = new Driver();
        d.menu();
    }
    public void menu(){
        boolean keepGoing = true;
         // make the main menu
        while(keepGoing){
            System.out.println("-----------------------------------------------");
             System.out.println("Welcome to Family Tree Simulator! ");
             System.out.println();
             System.out.println("What would you like to do? ");
             System.out.println("1) Build your own family tree ");
             System.out.println("2) Use sample family tree ");
             System.out.println("3) Quit ");
             System.out.println();
             Scanner input = new Scanner(System.in);
             String choice = input.nextLine();
             if(choice.equals("1")){
                 bt.binaryMenu();
             } else if(choice.equals("2")){
                 // make menu for sample data
                 t.sampleMenu();
                 System.out.println("----------------------------------------------------");
                 System.out.println();
             } else if(choice.equals("3")){
                 keepGoing = false;
             } else {
                 System.out.println("Please enter a valid number ");
             } // end if
        }// end while
    }// end menu
}