package module5;
import java.util.*;
class DoublyLinkedList {    
    //A node class for doubly linked list
    class Node{  
        int item;  
        Node previous;  
        Node next;  
         public Node(int item) {  
            this.item = item;  
        }  
    }  
    //Initially, head and tail is set to null
    Node head, tail = null;  
   
    //add a node to the list  
    public void addNode(int item) {  
        //Create a new node  
        Node newNode = new Node(item);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
    public void deleteNodes() {
    	int x = head.item;
        head = head.next;
        System.out.println("Element "+x +" got deleted");

    	
    }
//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  
}
class DList{
    public static void main(String[] args) {  
        //create a DoublyLinkedList object
        DoublyLinkedList dl_List = new DoublyLinkedList();  
           Scanner sc = new Scanner(System.in);
        String choice = "";
        while(!choice.equals("4")){
        System.out.print("\n1. Insert at End \n2. Delete From Front \n3. Display \n4.Exit\n");
           System.out.println("Enter the choice:");
        choice = sc.nextLine();
        switch(choice){
         case "1": System.out.print("Enter the number to insert:");
           int data = sc.nextInt();
               sc.nextLine();
        dl_List.addNode(data);  
            System.out.println("Data inserted Successfully");
             break;
            case "2": 
        dl_List.deleteNodes();  
        break;
        case "3":
        // list.display();
        dl_List.printNodes();    
        break;
         case "4": break;
         default: System.out.println("Invalid Choice");
         }
        }
        }  
}  
