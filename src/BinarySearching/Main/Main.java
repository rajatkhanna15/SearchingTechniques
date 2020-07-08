package BinarySearching.Main;

import BinarySearching.OrderedArray.OrderedArray;

/**
 * This class acts as a tester class for OrderedArray.java class.
 */
public class Main {

    public static void main(String[] args)
    {
        int maxSize = 100;
        //Creating object of OrderedArray class.
         OrderedArray arr = new OrderedArray(maxSize);
        //Calling of methods
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(22);

        arr.display();

        int searchKey = 55 ;
        if(arr.find(searchKey) != arr.size())
            System.out.println("Found "+searchKey);
        else
            System.out.println("not found "+searchKey);

        arr.delete(22);
        arr.delete(77);

        arr.display();

    }
}

