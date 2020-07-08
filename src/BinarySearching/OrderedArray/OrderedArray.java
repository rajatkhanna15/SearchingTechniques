package BinarySearching.OrderedArray;

/**
 * Class declaration OrderedArray.java
 * Performing Binary Search.
 * This searching algorithm works on Sorted Data.
 */
public class OrderedArray {
    /**
     * Some instance variables
     * array to store data items
     * nElems to store number of data items.
     */
    private long[] array;
    private int nElems;
    /**
     * Constructor to initialise default values to the instance variables.
     * @param max the max (size of array)
     */

    public OrderedArray(int max)
    {
        array = new long[max];
        nElems = 0 ;
    }


}
