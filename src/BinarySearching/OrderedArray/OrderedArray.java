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


    /**
     * find() method to check whether a given value is present in the given array or not(the basic binary Searching implementation method.
     * @param searchKey the searchKey(value to be searched).
     */
    public int find(long searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int middleValue;

        while(true)
        {
            middleValue = (lowerBound + upperBound) / 2;
            if(array[middleValue] == searchKey)
                return middleValue;
            else if(lowerBound > upperBound)
                return nElems;
            else
            {
                if(array[middleValue] < searchKey)
                   lowerBound = middleValue + 1;               //upper half
                else
                    upperBound = middleValue - 1;              //lower half
            }
        }
    }





}
