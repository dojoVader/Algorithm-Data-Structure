

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

    void print() {
        System.out.print("Stack MAX Element Size: " + getSize() + "\n");
        System.out.println("Top is "+ top);
        for(int idx=0; idx < MAX; idx++){
            System.out.format("Array [%d] => [%d] \n",idx,stack[idx]);
        }
    }

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



    public static void main(String[] arg){
        System.out.print("Stack Array..... \n");
      
 
            StackArray stackArray = new StackArray(5);
            stackArray.push(10);
            stackArray.push(20);
            stackArray.push(30);
            stackArray.push(40);
            stackArray.push(50);
            stackArray.print();
            stackArray.push(60);
            stackArray.print();
  
     


    }
}