class ArrayRotation{

	static int[] rotateArray(int[] arrayList, int rotation){
	 int[] tempArray=new int[arrayList.length]; //Initiate the array by number of rotation
	 //We need to break the 
	 for(int count=0; count < tempArray.length; count++){
	 	//Using the Modulus Operator let's create the Array
	 	int tempValue = arrayList[count];
	 	//This gets Index of the Array and minus the offset the array is supposed to be shifted, a modulus is placed to reset the 
	 	//array if it exceeds the size of the array
	 	int newValue = (((tempValue % arrayList.length) - 1) - (rotation % arrayList.length));
	 	newValue = ((arrayList.length + (newValue)) % arrayList.length);
	 	tempArray[newValue]=tempValue;

	 }
	 return tempArray;
	}

    public static void main(String args[]){
        /* Driver program to check above functions */

	   // Let us search 3 in below array
	   int arr[] = {1,2,3,4,5,6, 7};
	   int rotation_index=8;  
	   int newArray[] = rotateArray(arr,rotation_index);

	   //Print the values

	   for(int count=0; count < newArray.length; count++){
	   	System.out.println(newArray[count]+"\t");
	   }
	   
	  
   }
    
}
