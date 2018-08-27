import java.lang.Object;

/**
 * This approach shifts all the values by 1 and sets the last element prior to
 * shifting to the first index
 */

// Best and Worst case 0(n)
public class CyclicalArrayRotation {

    static void cyclicalShiftLeft(int arr[]) {
        // We will need to get the last element in the array
        int lastElement = arr[arr.length - 1];

        // Start from the second element
        for (int offset = (arr.length - 1); offset > 0; offset--) {
            // Get the previous value and set to it
            int previousElement = arr[offset - 1];
            arr[offset] = previousElement;
        }
        // Add the last element to the first element
        arr[0] = lastElement;

    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 ,8 };
        System.out.println("Printing before Operation");
        printArray(arr);
        cyclicalShiftLeft(arr);
        System.out.println("Printing after Operation");
        cyclicalShiftLeft(arr);
        System.out.println("Printing after Operation");
        printArray(arr);

    }
}