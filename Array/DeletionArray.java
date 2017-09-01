// Java program to implement linear 
// search in unsorted arrays
 
class DeletionArray
{
    //Write the function to search for a key in the array

    static int deleteElement(int[] arrayList, int length, int key){
       int arrayIndex;
       for(int i=0; i < length; i++){
           if(arrayList[i] == key){
               //Find the Item to be deleted
               arrayIndex=i;
               while(arrayIndex < length-1){
                   arrayList[arrayIndex] = arrayList[arrayIndex+1];
                   arrayIndex++;
               }

           }
       }
       return length - 1;
       
    }
      
   // main Function
    public static void main(String args[])
    {
        int i;
        int arr[] = {10, 50, 30, 40, 20};
      
        int n = arr.length;
        int key = 10;
      
        System.out.println("Array before deletion");
        for (i=0; i<n; i++)
          System.out.print(arr[i] + " ");
      
        n = deleteElement(arr, n, key);
      
        System.out.println("\n\nArray after deletion");
        for (i=0; i<n; i++)
          System.out.print(arr[i]+" ");
    } 
}