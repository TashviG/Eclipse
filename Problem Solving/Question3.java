//Question 3
//Develop a program that compares the execution times of 7 sorting algorithms including Selection Sort, Insertion Sort, Bubble Sort, 
//Quick Sort, Merge Sort, and Counting Sort (these 6 algorithms are presented in lectures and tutorials), 
//and another sorting algorithm that is different from these above-mentioned algorithms and available on a website or 
//textbook about data structures and algorithms (a reference to this website or textbook should be added to your report)
//https://www.geeksforgeeks.org/heap-sort/

package u3165466A1;


import java.text.DecimalFormat;
import java.util.Random;

public class Question3 {

    public static void main(String []args){
          
        int numberOfElements = 100000; // Declare a data set which contains 100000 integers
        
        DecimalFormat df= new DecimalFormat("#.00"); // Output in 2 decimal places.
        
        //SORTING ALL SORTS IN ASCENDING ORDER
        
        //SELECTION SORT 
        int[] temp1 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp1[i] = i + 1;
        }
        long start1 = System.currentTimeMillis( );
        selectionSort(temp1);
        long end1 = System.currentTimeMillis( );
        long diff1 = end1 - start1;
        System.out.println("Ascending order set - Selection sort: " + df.format(diff1) + " milliseconds.");
        
        //BUBBLE SORT
        int[] temp5 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp5[i] = i + 1;
        }
        long start5 = System.currentTimeMillis( );
        bubbleSort(temp5);
        long end5 = System.currentTimeMillis( );
        long diff5 = end5 - start5;
        System.out.println("Ascending order set - Bubble sort: " + df.format(diff5) + " milliseconds.");
        
        //INSERTION SORT
        int[] temp9 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            temp9[i] = i + 1;
        }
        long start9 = System.currentTimeMillis( );
        insertionSort(temp9); 
        long end9 = System.currentTimeMillis( );
        long diff9 = end9 - start9;
        System.out.println("Ascending order set - Insertion sort: " + df.format(diff9) + " milliseconds.");
        
        //QUICK SORT
        int[] temp13 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            temp13[i] = i + 1;
        }
        long start13 = System.currentTimeMillis( );
        quickSort(temp13, 1, 99999);
        long end13 = System.currentTimeMillis( );
        long diff13 = end13 - start13;
        System.out.println("Ascending order set - Quick sort: " + df.format(diff13) + " milliseconds.");
        
        //MERGE SORT
        int[] temp17 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            temp17[i] = i + 1;
        }
        long start17 = System.currentTimeMillis( );
        mergeSort(temp17, 1, 99999);
        long end17 = System.currentTimeMillis( );
        long diff17 = end17 - start17;
        System.out.println("Ascending order set - Merge sort: " + df.format(diff17) + " milliseconds.");
        
        //COUNTING SORT
        int[] temp21 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            temp21[i] = i + 1;
        }
        long start21 = System.currentTimeMillis( );
        countingSort(temp21);
        long end21 = System.currentTimeMillis( );
        long diff21 = end21 - start21;
        System.out.println("Ascending order set - Counting sort: " + df.format(diff21) + " milliseconds.");

        //HEAP SORT - ADDITIONAL SORT 
        int[] temp25 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            temp25[i] = i + 1;
        }
        long start25 = System.currentTimeMillis( );
        heapSort(temp25);
        long end25 = System.currentTimeMillis( );
        long diff25 = end25 - start25;
        System.out.println("Ascending order set - Heap sort: " + df.format(diff25) + " milliseconds.");

        //END OF ASCENDING METHOD
        
        
      //SORTING ALL SORTS IN DESCENDING ORDER
        
        // Selection Sort
        int[] temp2 = new int[numberOfElements];
        for (int i = numberOfElements - 1; i >= 0; i--) {
                temp2[i] = i + 1;
        }
        long start2 = System.currentTimeMillis( );
        selectionSort(temp2); // 
        long end2 = System.currentTimeMillis( );
        long diff2 = end2 - start2; //
        System.out.println("\nDescending order set - Selection sort: " + df.format(diff2) + " milliseconds.");
    
        // Bubble Sort
        int[] temp6 = new int[numberOfElements];
        for (int i = numberOfElements - 1; i >= 0; i--) {
                temp6[i] = i + 1;
        }
        long start6 = System.currentTimeMillis( );
        bubbleSort(temp6); // 
        long end6 = System.currentTimeMillis( );
        long diff6 = end6 - start6; //
        System.out.println("Descending order set - Bubble sort: " + df.format(diff6) + " milliseconds.");

    
        // Insertion Sort
        int[] temp10 = new int[numberOfElements];
        for (int i = numberOfElements - 1; i >= 0; i--) {
                temp10[i] = i + 1;
        }
        long start10 = System.currentTimeMillis( );
        insertionSort(temp10); // 
        long end10 = System.currentTimeMillis( );
        long diff10 = end10 - start10; //
        System.out.println("Descending order set - Insertion sort: " + df.format(diff10) + " milliseconds.");
    
        // Quick Sort
        int[] temp14 = new int[numberOfElements];
        for (int i = numberOfElements - 1; i >= 0; i--) {
                temp14[i] = i + 1;
        }
        long start14 = System.currentTimeMillis( );
        quickSort(temp14, 1,99999); // 
        long end14 = System.currentTimeMillis( );
        long diff14 = end14 - start14; //
        System.out.println("Descending order set - Quick sort: " + df.format(diff14) + " milliseconds.");
    
        // Merge Sort
        int[] temp18 = new int[numberOfElements];
        for (int i = numberOfElements - 1; i >= 0; i--) {
                temp18[i] = i + 1;
        }
        long start18 = System.currentTimeMillis( );
        mergeSort(temp18, 1,99999); // 
        long end18 = System.currentTimeMillis( );
        long diff18 = end18 - start18; //
        System.out.println("Descending order set - Merge sort: " + df.format(diff18) + " milliseconds.");
    
        // Counting Sort
        int[] temp22 = new int[numberOfElements];
        for (int i = numberOfElements - 1; i >= 0; i--) {
                temp22[i] = i + 1;
        }
        long start22 = System.currentTimeMillis( );
        countingSort(temp22); 
        long end22 = System.currentTimeMillis( );
        long diff22 = end22 - start22; //
        System.out.println("Descending order set - Counting sort: " + df.format(diff22) + " milliseconds.");
    
        // Heap Sort
        int[] temp26 = new int[numberOfElements];
        for (int i = numberOfElements - 1; i >= 0; i--) {
                temp26[i] = i + 1;
        }
        long start26 = System.currentTimeMillis( );
        heapSort(temp26); 
        long end26 = System.currentTimeMillis( );
        long diff26 = end26 - start26; 
        System.out.println("Descending order set - Heap sort: " + df.format(diff26) + " milliseconds.");
    
        //END OF DESCENDING METHOD
        
      //SORTING ALL SORTS RANDOMLY INCLUDING DUPLCATES
        
        
        // Selection
        // Generate elements in the array with random integers < maxInt
        int[] temp3 = new int[numberOfElements];
        Random rand3 = new Random();
        for (int i = 0; i < temp3.length; i++) {
                temp3[i] = rand3.nextInt(numberOfElements);
        }
        long start3 = System.currentTimeMillis( );
        selectionSort(temp3); // 
        long end3 = System.currentTimeMillis( );
        long diff3 = end3 - start3; //
        System.out.println("\nRandom set, duplicates - Selection sort: " + df.format(diff3) + " milliseconds.");
        
        // Bubble
        int[] temp7 = new int[numberOfElements];
        Random rand7 = new Random();
        for (int i = 0; i < temp7.length; i++) {
                temp7[i] = rand7.nextInt(numberOfElements);
        }
        long start7 = System.currentTimeMillis( );
        bubbleSort(temp7); // 
        long end7 = System.currentTimeMillis( );
        long diff7 = end7 - start7; //
        System.out.println("Random set, duplicates - Bubble sort: " + df.format(diff7) + " milliseconds.");
    
        // Insertion
        int[] temp11 = new int[numberOfElements];
        Random rand11 = new Random();
        for (int i = 0; i < temp11.length; i++) {
                temp11[i] = rand11.nextInt(numberOfElements);
        }
        long start11 = System.currentTimeMillis( );
        insertionSort(temp11); // 
        long end11 = System.currentTimeMillis( );
        long diff11 = end11 - start11; //
        System.out.println("Random set, duplicates - Insertion sort: " + df.format(diff11) + " milliseconds.");
    
        // Quick
        int[] temp15 = new int[numberOfElements];
        Random rand15 = new Random();
        for (int i = 0; i < temp15.length; i++) {
                temp15[i] = rand15.nextInt(numberOfElements);
        }
        long start15 = System.currentTimeMillis( );
        quickSort(temp15, 1, 99999); // 
        long end15 = System.currentTimeMillis( );
        long diff15 = end15 - start15; //
        System.out.println("Random set, duplicates - Quick sort: " + df.format(diff15) + " milliseconds.");
    
        // Merge
        int[] temp19 = new int[numberOfElements];
        Random rand19 = new Random();
        for (int i = 0; i < temp19.length; i++) {
                temp19[i] = rand19.nextInt(numberOfElements);
        }
        long start19 = System.currentTimeMillis( );
        mergeSort(temp19, 1, 99999); // 
        long end19 = System.currentTimeMillis( );
        long diff19 = end19 - start19; //
        System.out.println("Random set, duplicates - Merge sort: " + df.format(diff19) + " milliseconds.");
        
        // Counting
        int[] temp23 = new int[numberOfElements];
        Random rand23 = new Random();
        for (int i = 0; i < temp23.length; i++) {
                temp23[i] = rand23.nextInt(numberOfElements);
        }
        long start23 = System.currentTimeMillis( );
        mergeSort(temp23, 1, 99999); // 
        long end23 = System.currentTimeMillis( );
        long diff23 = end23 - start23; //
        System.out.println("Random set, duplicates - Counting sort: " + df.format(diff23) + " milliseconds.");
        
        // Heap Sort
        int[] temp27 = new int[numberOfElements];
        Random rand27 = new Random();
        for (int i = 0; i < temp27.length; i++) {
                temp27[i] = rand27.nextInt(numberOfElements);
        }
        long start27 = System.currentTimeMillis( );
        heapSort(temp27); 
        long end27 = System.currentTimeMillis( );
        long diff27 = end27 - start27; //
        System.out.println("Random set, duplicates - Heap sort: " + df.format(diff27) + " milliseconds.");
        
        //END OF SORTING WITH DUPLICATES-RANDOM
        
        
        
      //SORTING ALL SORTS RANDOMLY WITHOUT DUPLICATES 
        
        // Selection
        int[] temp4 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp4[i] = i + 1;
        }
        shuffleArray(temp4);
        long start4 = System.currentTimeMillis( );
        selectionSort(temp4); 
        long end4 = System.currentTimeMillis( );
        long diff4 = end4 - start4;
        System.out.println("\nRandom set, no duplicates - Selection sort: " + df.format(diff4) + " milliseconds.");
        
        // Bubble
        int[] temp8 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp8[i] = i + 1;
        }
        shuffleArray(temp8);
        long start8 = System.currentTimeMillis( );
        bubbleSort(temp8); 
        long end8 = System.currentTimeMillis( );
        long diff8 = end8 - start8;
        System.out.println("Random set, no duplicates - Bubble sort: " + df.format(diff8) + " milliseconds.");
        
        // Insertion
        int[] temp12 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp12[i] = i + 1;
        }
        shuffleArray(temp12);
        long start12 = System.currentTimeMillis( );
        insertionSort(temp12); 
        long end12 = System.currentTimeMillis( );
        long diff12 = end12 - start12;
        System.out.println("Random set, no duplicates - Insertion sort: " + df.format(diff12) + " milliseconds.");
        
        // Quick
        int[] temp16 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp16[i] = i + 1;
        }
        shuffleArray(temp16);
        long start16 = System.currentTimeMillis( );
        quickSort(temp16, 1, 99999); 
        long end16 = System.currentTimeMillis( );
        long diff16 = end16 - start16;
        System.out.println("Random set, no duplicates - Quick sort: " + df.format(diff16) + " milliseconds.");
        
        // Merge
        int[] temp20 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp20[i] = i + 1;
        }
        shuffleArray(temp20);
        long start20 = System.currentTimeMillis( );
        mergeSort(temp20, 1, 99999); 
        long end20 = System.currentTimeMillis( );
        long diff20 = end20 - start20;
        System.out.println("Random set, no duplicates - Merge sort: " + df.format(diff20) + " milliseconds.");
        
        // Counting
        int[] temp24 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp24[i] = i + 1;
        }
        shuffleArray(temp24);
        long start24 = System.currentTimeMillis( );
        countingSort(temp24); 
        long end24 = System.currentTimeMillis( );
        long diff24 = end24 - start24;
        System.out.println("Random set, no duplicates - Counting sort: " + df.format(diff24) + " milliseconds.");
        
        // Heap
        int[] temp28 = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
                temp28[i] = i + 1;
        }
        shuffleArray(temp28);
        long start28 = System.currentTimeMillis( );
        heapSort(temp28); 
        long end28 = System.currentTimeMillis( );
        long diff28 = end28 - start28;
        System.out.println("Random set, no duplicates - Heap sort: " + df.format(diff28) + " milliseconds.");
        
    }

       //END OF SORTING METHOD WITHOUT DUPLICATES-RANDOM
    
    // Random-No Duplicates//
    public static void shuffleArray(int[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }
    private static void swap(int[] a, int i, int change) {
        int helper = a[i];
        a[i] = a[change];
        a[change] = helper;
    }
    //Random- No Duplicates// 
    
    
    //SELECTION SORT METHOD
    public static void selectionSort (int[] array) {
            int minIndex; // index of smallest item in each pass
            int pass, j, n = array.length;
            int temp;
            
            // sort array[0]..array[n-2], and array[n-1] is in place
            for (pass = 0; pass < n - 1; pass++) {
                // scan from index pass; set minIndex to pass
                minIndex = pass;
                // j scans the sublist array[pass+1]..array[n-1]
                for (j = pass + 1; j < n; j++) {
                    // update minIndex if smaller element found
                    if (array[j] < array[minIndex])
                    minIndex = j;
                }
                // place smallest item in array[pass]
                if (minIndex != pass) {
                    temp = array[pass];
                    array[pass] = array[minIndex];
                    array[minIndex] = temp;
                }
            }
        }
    //BUBBLE SORT METHOD
    public static void bubbleSort (int[] arr) {
        int j;
        boolean flag = true;   
        int temp;   
        
        while (flag) {
            flag = false;    
            for(j = 0;  j < arr.length - 1;  j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];                
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; 
                } 
            } 
        } 
    }
    //INSERTION SORT METHOD
    public static void insertionSort (int[] array) {
        int i, j, n = array.length;
        int target;
        // place array[i] into the sublist array[0] ... array[i-1], 1 <= i < n,
        // so it is in the correct position
        for (i = 1; i < n; i++) {
            // index j scans down list from array[i] looking for
            // correct position to locate target 
            j = i;
            // assigns it to array[j]
            target = array[j];
            // locate insertion point by scanning downward as long as target < array[j-1] 
            // and we have not encountered the beginning of the list
            while (j > 0 && target < array[j - 1]) {
                // shift elements up to make room for insertion
                array[j] = array[j - 1];
                j--;
            }
            // the location is found; insert target
            array[j] = target;
        }
   }
    //QUICK SORT METHOD
    public static void quickSort (int[] array, int fromIndex, int toIndex) {
            int i = fromIndex;
            int j = toIndex;
            int pivot = array[fromIndex + (toIndex - fromIndex) / 2];
            while (i <= j) {
                while (array[i] < pivot) { i++; }
                while (array[j] > pivot) { j--; }
                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    // move index to next position on both sides
                    i++;
                    j--;
                }
            }
            if (fromIndex < j)
                quickSort(array, fromIndex, j);
            if (i < toIndex)
                quickSort(array, i, toIndex);
        }
    //MERGE SORT METHOD
    public static void mergeSort(int[] array, int fromIndex, int toIndex) {
           if (fromIndex < toIndex) {
                int middleIndex = fromIndex + (toIndex - fromIndex) / 2;
                // Sort the left side of the array
                mergeSort(array, fromIndex, middleIndex);
                // Sort the right side of the array
                mergeSort(array, middleIndex + 1, toIndex);
                // Merge both sides
                mergeSides(array, fromIndex, middleIndex, toIndex);
            }
       }
    public static void mergeSides (int[] array, int fromIndex, int middleIndex, int toIndex) {
        int[] tmp = new int[array.length];
        for (int i = fromIndex; i <= toIndex; i++) {
            tmp[i] = array[i];
        }
        int i = fromIndex;
        int j = middleIndex + 1;
        int k = fromIndex;
        while (i <= middleIndex && j <= toIndex) {
            if (tmp[i] <= tmp[j]) {
                array[k] = tmp[i];
                i++;
            } else {
                array[k] = tmp[j];
                j++;
            }
            k++;
        }
        while (i <= middleIndex) {
            array[k] = tmp[i];
            k++;
            i++;
        }
    }
    
    //COUNTING SORT METHOD
    public static void countingSort(int[] array) {
        // Find maximum element in the array
        int maxInteger = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxInteger < array[i]) {
                maxInteger = array[i];
            }
        }

        // Count how many times each element appears in the array
        int[] countingArray = new int[maxInteger + 1];
        for (int i = 0; i < array.length; i++) {
            int integerToBeCounted = array[i];
            if (integerToBeCounted >= 0) {
                countingArray[integerToBeCounted]++;
            }
        }
        // Sort the array
        int currentIndex = 0;
        for (int i = 0; i <= maxInteger; i++) {
            for (int k = 0; k < countingArray[i]; k++) {
                array[currentIndex] = i;
                currentIndex++;
            }
        }
    }
    
    //HEAP SORT METHOD
    public static void heapSort(int[] array)
    {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }
    static void heapify(int[] array, int n, int i)
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap 
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && array[l] > array[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && array[r] > array[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
    
}
