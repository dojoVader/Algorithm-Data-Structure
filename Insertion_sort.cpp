#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
    
    //declare an int array and sort
    int unsorted_array[6]={5,2,4,6,1,3};
    
    for(int count = 1; count < 6; count++){
     int current_key=unsorted_array[count];
     int previous_key=(count - 1);
     while(count > 0 && unsorted_array[previous_key] > current_key)
     {
       //This checks that previous value is greater than the next, if so assign the previous to the next  
       unsorted_array[previous_key + 1] = unsorted_array[previous_key];
       previous_key=previous_key - 1;
     }
     unsorted_array[previous_key + 1] = current_key;
     
        
    }
    cout <<"After Sorting\n"<<endl;
    for(int c=0; c < 6;c++){
     printf("%d",unsorted_array[c]);   
    }
}
