import java.lang.Object;

/**
 * Reverse the arrays almost like the original array 
 * but in the case we swap the first two item, and the rest then we swap evrything all over
 */

 //Best and Worst case 0(n)
public class ArrayReverseAlgorithm {

    static void reverseArray(int array[], int start, int end) {
        // Keep running a while loop when condition is true
        while (start < end) {
            // Get the First Value and last
            int firstVal = array[start];
            int lastVal = array[end];
            // Swap the data
            array[start] = lastVal;
            array[end] = firstVal;
            start++;
            end--;
        }
      
    }

    // Time Complexity O(n) as the in
    static void shiftLeft(int[] array, int offset, int end){
        reverseArray(array, 0, offset - 1); // Reverse the from the Start to Offset Element and swaps that
        reverseArray(array, offset, end - 1); // Reverse the Dth to the end of the Array all items not the first arrangement
        reverseArray(array, 0, end-1); // Reverse all the items back together
    }


    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7};

        int d = 3;
        System.out.println("Printing reversal before method called");
        printArray(arr);
        shiftLeft(arr, d, arr.length);
        System.out.println("Printing reversal after method called");
        printArray(arr);
        
       
    }
}