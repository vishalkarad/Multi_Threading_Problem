public class MergeAndQuickSort {
    int mergeSortArray[] = {12, 11, 13, 5, 6, 7};
    int quickSortArray[] = {10, 7, 8, 9, 1, 5};
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        Thread thread1 = new Thread(mergeSort);
        Thread thread2 = new Thread(quickSort);
        thread1.run();
        thread2.run();
    }

}
