

public class StackArray{

    int[] stack;
    int MAX;
    int top;

    StackArray(int MAX){
        this.MAX = MAX;
        stack = new int[MAX];
        top = -1;
    }

    public int getSize(){
        return MAX;
    }
    // O(n)
    void print() {
        System.out.print("Stack MAX Element Size: " + getSize() + "\n");
        System.out.println("Top is "+ top);
        for(int idx=0; idx < MAX; idx++){
            System.out.format("Array [%d] => [%d] \n",idx,stack[idx]);
        }
    }

    //O(1)
    boolean push(int data){
        // Check that we are not top already, meaning no more space
        if(top == (MAX - 1)){
            System.out.println("Stack overflow no more record.");
            return false;
        }else{
            ++top;
            stack[top] = data;
        }
        return true;
 
    }

    // O(1)
    int pop (){
        // We need to check that there are items to be popped
        if(top >= 0){
            // We need to remove the item at the top first
            int value = stack[top];
            stack[top] = 0;
            --top;
            System.out.format("item popped: %d \n", value);
            return value;
            
        }else{
            System.out.println("Nothing to Pop off anymore \n");
            return 0;
        }
    }



    public static void main(String[] arg){
        System.out.print("Stack Array..... \n");
      
 
            StackArray stackArray = new StackArray(5);
            stackArray.push(10);
            stackArray.push(20);
            stackArray.push(30);
            stackArray.push(40);
            stackArray.push(50);
         
            stackArray.pop();
            stackArray.pop();
            stackArray.pop();
            stackArray.pop();
            stackArray.pop();
            stackArray.print();
            stackArray.push(20);
            stackArray.print();
     


    }
}