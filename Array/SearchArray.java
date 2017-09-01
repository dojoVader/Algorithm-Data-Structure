// Java program to implement linear 
// search in unsorted arrays
 
class SearchArray
{
    //Write the function to search for a key in the array

    static int findElement(int[] arrayList, int length, int key){
        for(int count=0; count < length; count++){
            if(arrayList[count] == key){
                return count;
            }
        }
        return -1; //Signifies Key was never found
    }
      
    // main Function
    public static void main(String args[])
    {
        int arr[] = {12, 34, 10, 6, 40};
        int n = arr.length;
      
        // Using a last element as search element
        int key =40;
        int position = findElement(arr,n,key);
      
        if (position==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: "
                                             + (position+1));
    }
}