import java.lang.Object;
import java.util.HashMap;
import java.util.Map;

class SumOfPairsWithMap {
    // Space Complexity (O(n))
    static HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    static void findSumofPairsWithMap(int[] ar, int sum) throws Exception {
        int timesRan=0;
        // Find the difference
        if(hashMap.isEmpty()){
            throw new Exception(" Hashmap should be set for this operation");
        }
        for(int count = 0 ; count < ar.length; count++){
            timesRan++;
            //Find the difference
            int differenceValue = Math.abs(ar[count] - sum);
            if(hashMap.containsKey(differenceValue)){
                System.out.format("There is a pair (%d, %d) with sum %d", ar[count], differenceValue, sum);
                System.out.println("");
                System.out.println("Times ran: " + timesRan);
                System.out.println("");
                break;
            }else{
                continue;
            }
        }
    }

    public static void main(String[] args) {

        int[] arrayOfpairs = { 11, 15, 26, 38, 9, 10 };

        int sumValue = 41;

        // Add the items to the Hashmap
        // O(n)
        for (int a : arrayOfpairs) {
            hashMap.put(a, a);
        }

   
        try{
            findSumofPairsWithMap(arrayOfpairs, sumValue);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       

    }
}