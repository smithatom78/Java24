package module4;
import java.util.*;
public class Alist 
{  public static void main(String []args) 
        { ArrayList<Integer> arrlstInt = new ArrayList<Integer>(); //Declaring ArrayList
         arrlstInt.add(1);
         arrlstInt.add(2);
         arrlstInt.add(3);
         arrlstInt.add(4);
         arrlstInt.add(0, 5);
         arrlstInt.add(3, 30);
         System.out.println("The Initial array elements  are:");
       	 for (int currArrLstElement : arrlstInt) 
            {   System.out.print(currArrLstElement+" ");
            } 
         Scanner scanner = new Scanner(System.in);
         System.out.println("\nEnter the number of elements to be added in the List: ");
                  int num = scanner.nextInt();
         System.out.println("Enter the number to add into the List: ");
                  for (int i=0;i<num;i++) 
         {  int num1 = scanner.nextInt();
         	arrlstInt.add(num1);
          }
         System.out.println(num+ "Numbers added ");
         
         System.out.println("The array elements  are:");

       	 for (int currArrLstElement : arrlstInt) 
            {   System.out.print(currArrLstElement+" ");
            }      
         System.out.println("\nEnter the number to search: ");
       //  Scanner scanner = new Scanner(System.in);
       int searchterm = scanner.nextInt();
		if (arrlstInt.contains(searchterm))
		{
		          System.out.println("The item is found in ArrayList!");
		}
		else 
		{System.out.println("The item does not exist!");
		}
		
       /* for (int x=0;x < arrlstInt.size();x++){
             System.out.println(arrlstInt.get(x));
          }*/

}
}
