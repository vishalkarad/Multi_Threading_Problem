public class MergeSort extends MergeAndQuickSort implements Runnable{

    void merge(int arr[], int left, int middle, int right) {
        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle;

        int leftArray[] = new int[leftArraySize];
        int rightArray[] = new int[rightArraySize];

        for (int index = 0; index < leftArraySize; ++index)
            leftArray[index] = arr[left + index];
        for (int index = 0; index < rightArraySize; ++index)
            rightArray[index] = arr[middle + 1 + index];

        // Merge the temp arrays
        int leftIndex = 0, rightIndex = 0;

        // Initial index of merged subarry array
        int temp = left;
        while (leftIndex < leftArraySize && rightIndex < rightArraySize) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                arr[temp] = leftArray[leftIndex];
                leftIndex++;
            } else {
                arr[temp] = rightArray[rightIndex];
                rightIndex++;
            }
            temp++;
        }

        // Copy remaining elements of L[] if any
        while (leftIndex < leftArraySize) {
            arr[temp] = leftArray[leftIndex];
            leftIndex++;
            temp++;
        }

        // Copy remaining elements of R[] if any
        while (rightIndex < rightArraySize) {
            arr[temp] = rightArray[rightIndex];
            rightIndex++;
            temp++;
        }
    }

    // Main function that sorts array
    void sort(int array[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    // print array
    static void printArray(int array[]) {
        for (int array1 : array)
            System.out.print(array1+" ");
    }

    // Run method
    public void run() {
        MergeSort obj = new MergeSort();
        obj.sort(mergeSortArray, 0, mergeSortArray.length - 1);
        System.out.println("\nSorted Merge Sort array");
        printArray(mergeSortArray);
    }

}
