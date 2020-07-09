package LinearSearching.Main;

/**
 * Main class which acts as a tester class for SimpleArray.java class
 */
import LinearSearching.SimpleArray.SimpleArray;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("How many data items you want to enter??");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the data items");
        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt();
        }

        System.out.println("Entered elements are :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Enter the value to be searched");
        int searchKey = scanner.nextInt();

        //Creating object of SimpleArray class
        SimpleArray sArray = new SimpleArray();
        if(sArray.find(array,searchKey) != -1)
            System.out.println("Element found at index " +sArray.find(array,searchKey));
        else
            System.out.println("Element not found");
    }
}
