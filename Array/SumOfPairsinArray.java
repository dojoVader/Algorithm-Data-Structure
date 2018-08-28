import java.lang.Object;

class SumOfPairsinArray {

    static void findSumofPairsBruteForce(int[] ar, int sum) {
        int timesRan = 0;
        int found = 0;

        // let's get the first item in the array

        // O (n)
        for (int arraySeeker = 0; arraySeeker < ar.length; arraySeeker++) {
            timesRan++;

            if (found == 1) {
                break;
            }
            // O(n)
            for (int innerCount = 0; innerCount < ar.length; innerCount++) {
                if (ar[innerCount] + ar[arraySeeker] == sum) {
                    System.out.format("There is a pair (%d, %d) with sum %d", ar[arraySeeker], ar[innerCount], sum);
                    System.out.println("");
                    System.out.println("Times ran: " + timesRan);
                    System.out.println("");
                    found = 1;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] arrayOfpairs = { 11, 15, 6, 8, 9, 10 };

        int sumValue = 26;

        // O(n2)
        findSumofPairsBruteForce(arrayOfpairs, sumValue);

    }
}