class QuickSort extends MergeAndQuickSort implements Runnable{

    // partition
    int partition(int array[], int low, int high)
    {
        int pivot = array[high];
        int index = (low-1);
        for (int j=low; j<high; j++)
        {
            if (array[j] <= pivot)
            {
                index++;
                // swap arr[i] and arr[j]
                int temp = array[index];
                array[index] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[index+1];
        array[index+1] = array[high];
        array[high] = temp;
        return index+1;
    }

    // The main function that implements QuickSort()
    void sort(int array[], int startingIndex, int endingIndex)
    {
        if (startingIndex < endingIndex)
        {
            int pi = partition(array, startingIndex, endingIndex);
            sort(array, startingIndex, pi-1);
            sort(array, pi+1, endingIndex);
        }
    }

    // A utility function to print array of size
    static void printArray(int array[])
    {
        for (int i=0; i<array.length; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    // Driver program
    public void run()
    {
        QuickSort ob = new QuickSort();
        ob.sort(quickSortArray, 0, quickSortArray.length-1);
        System.out.println("\nSorted Quick Sort Array");
        printArray(quickSortArray);
    }
}
