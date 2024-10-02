package module5;
import java.util.Scanner;
class Quicksort
{ void quickSort(String[] names, int low, int upp) {
    if(low < upp) {
        int location = partition(names, low, upp);

        quickSort(names, low, location-1);
      // quickSort(names, location+1,upp);
    }
}
static int partition(String[] names, int low, int upp) {
    int start = low;
    int end = upp;
    String pivot = names[low];

    while(names[start].charAt(0) <= pivot.charAt(0) && start < end) {
        start++;
    }
    while(names[end].charAt(0) > pivot.charAt(0)) {
        end--;
    }
    if(start < end) {
        swap(names, start, end);
    }
    else {
        swap(names, end, low);
    }
    return end;
}
private static void swap(String[] array, int index1, int index2) {
    String temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}
	
}
public class Qsort{
    public static void main(String[] args) {
    	Quicksort q=new Quicksort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] names = new String[size];
        for(int i=0; i<size; ++i) {
            System.out.print("Enter the name of person "+(i+1)+": ");
            names[i] = sc.nextLine();
        }
        q.quickSort(names, 0, size-1);
        System.out.println("\nThe list of names after sorting is:");
        for(String name : names) {
            System.out.println(name+" ");
        }
    }

    

    
}
