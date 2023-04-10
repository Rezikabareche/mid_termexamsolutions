/*package algorithm;

import static java.io.ObjectInputFilter.merge;


public class Sort {


	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */
   /* long executionTime = 0;

    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
       // public int[] insertionSort(int[] array1) {

            final long startTime1 = System.currentTimeMillis();
            int[] list1 = array;
            int n = list.length;
            for (int i = 1; i < n; ++i) {
                int key = list[i];
                int j = i - 1;
                while (j >= 0 && list[j] > key) {
                    list[j + 1];

                }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] sortedArray = array;

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        // Store the sorted data into the database
        storeData("bubble_sort", sortedArray);

        final long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Bubble Sort Execution Time: " + executionTime + " ms");

        return sortedArray;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] sortedArray = array;

        for (int i = 1; i < sortedArray.length; i++) {
            int key = sortedArray[i];
            int j = i - 1;

            while (j >= 0 && sortedArray[j] > key) {
                sortedArray[j + 1] = sortedArray[j];
                j--;
            }

            sortedArray[j + 1] = key;
        }

        // Store the sorted data into the database
        storeData("insertion_sort", sortedArray);

        final long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Insertion Sort Execution Time: " + executionTime + " ms");

        return sortedArray;
    }

    public int[] mergeSort(int[] array, int left, int right) {
        final long startTime = System.currentTimeMillis();
        int[] sortedArray = array;

        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(sortedArray, left, middle);
            mergeSort(sortedArray, middle + 1, right);
            merge(sortedArray, left, middle);

    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
public int[] mergeSort(int[] array, int left, int right) {
        final long startTime = System.currentTimeMillis();
        int[] sortedArray = array;

        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(sortedArray, left, middle);
            mergeSort(sortedArray, middle + 1, right);
            merge(sortedArray, left, middle,

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
*/