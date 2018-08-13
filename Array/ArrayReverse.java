import java.lang.Object;

/**
 * Reverse the arrays
 */

 //Best and Worst case 0(n)
public class ArrayReverse {

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

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Running....");
        printArray(arr);
        System.out.println("");
        reverseArray(arr, 0, (arr.length - 1));
        printArray(arr);
        System.out.println("");
    }
}