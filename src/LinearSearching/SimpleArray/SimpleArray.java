package LinearSearching.SimpleArray;

/**
 * SimpleArray class for showing the basic implementation of Linear Searching.
 */
public class SimpleArray {

    /**
     * find() method to show the implementation of linear searching using an array and a searchkey
     * @param inputArray the array
     * @param searchKey the value to be searched
     * @return index of searchkey if found else -1
     */
    public int find(int[] inputArray,int searchKey)
    {
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == searchKey)
                return i;
        }
        return -1;
    }

}
