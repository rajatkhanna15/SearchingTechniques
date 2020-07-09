package LinearSearching.SimpleArray;

/**
 * SimpleArray class for showing the basic implementation of linear searching.
 */
public class SimpleArray {
    /**
     * Instance variables.
     */
    private long[] array;
    private int nElems;

    /**
     * Parametrised constructor to initialise the values.
     * @param max the max
     */
    public SimpleArray(int max)
    {
        array = new long[max];
        nElems = 0 ;
    }

    /**
     * size() method to return the current number of data items.
     */
    public int size()
    {
        return nElems;
    }


    /**
     * find() method to show the basic implementation of linear searching.
     * @param searchKey the searchKey.
     * @return  the index where the element is found otherwise -1.
     *
     */
    public int find(int searchKey)
    {
        for(int i = 0; i < array.length;i++)
            if(array[i] == searchKey)
                return i;
            return -1;
    }
}
