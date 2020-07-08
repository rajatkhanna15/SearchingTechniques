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


    /**
     * insert() method to insert the values in sorted order(ascending).
     * Binary searching works on Sorted Data.
     * @param value the value to be inserted.
     */
    public void insert(long value)
    {
        int j ;
        for(j = 0; j <nElems; j++)
            if(array[j] > value)
                break;
        for(int k = nElems; k > j; k++)
            array[k] = array[k-1];
        array[j] = value;
        nElems++;
    }


    /**
     * size() method to return the current number of data items.
     */
    public int size()
    {
        return nElems;
    }


    /**
     * delete() method to delete a particular value from the given array.
     * @param value the value to be deleted.
     */
    public boolean delete(long value)
    {
        int j = find(value);
        if(j == nElems)
            return false;
        else
        {
            for(int k=j; k<nElems; k++)
                array[k] = array[k+1];
            nElems--;
            return true;
        }
    }


    /**
     * display() method to display the array.
     */
    public void display()
    {
        for (int i = 0; i < nElems; i++)
        {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }



}
