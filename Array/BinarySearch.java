import java.lang.Object;

// This is the Binary Search Operation which requires a sorted array
public class BinarySearch {

    // Using the Iterative approach it will search for the item for every search
    // depending on the midpoint it splits the array into two
    // which is denoted by ( O log 2 n ) which is the same as (0 Log n ) as it
    // implies base 2

    // Time Complexity (O log n)
    static int binarySearch(int[] arr, int key) {

        // Get the midpoint for the Binary Search

        int loopHit = 0;
        int leftOffset = 0;
        int midpoint = 0;
        int endOffset = (arr.length - 1);
        while (leftOffset <= endOffset) {
            loopHit++;
            midpoint = (leftOffset + endOffset) / 2;
            if(arr[midpoint] == key){
                System.out.format("This algorithm ran %d times", loopHit);
                return midpoint;
            }
            else if (arr[midpoint] < key) {
                leftOffset = midpoint + 1; // Search the Right Directio

            } else if (arr[midpoint] > key) {
                endOffset = midpoint - 1;
            }
            
        }
        System.out.format("This algorithm ran %d times", loopHit);
        return -1;
    }

    public static void main(String[] args) {
        int[] searchArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int result = binarySearch(searchArray, 10);
        System.out.println("Result of Binary Search is "+result);
  
    }
}