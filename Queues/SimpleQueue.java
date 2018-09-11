
public class SimpleQueue {

    int[] queue;
    int MAX;
    int front;
    int back;
    int capacity;

    SimpleQueue(int MAX) {
        this.MAX = MAX;
        queue = new int[MAX];
        front = back = -1;
        capacity = (MAX - 1);
    }

    
    public int getSize() {
        return MAX;
    }

    public void enqueue(int data) {
        // We need to check that the first element is not empty first
        if (front < 0) {
            ++front; // Shift the Front to the head
            
        }
        if (back >= (MAX - 1)) {
            System.out.println("The Queue is currently full \n");
        } else {
            queue[++back] = data;
        }
    }

    public int dequeue() {

       if(capacity < 0){
           System.out.println("Queue is Empty cannot be deqeued \n");
           return -1;
       }
        //In the deque function we want to move the head
        int value = queue[front];
        queue[front] = 0;
        ++front;
        --capacity;
        return value;
    }

    boolean isFull(){
        return (back == (MAX-1));
    }

   

     // O(n)
     void print() {
        System.out.print("Queue Max Element Size: " + getSize() + "\n");
        for(int idx=0; idx < MAX; idx++){
            System.out.format("Array [%d] => [%d] \n",idx,queue[idx]);
        }
    }

    public static void main(String[] arg) {
            SimpleQueue queue = new SimpleQueue(2);
            queue.enqueue(5);
            queue.enqueue(6);
   
            queue.dequeue();
            queue.dequeue();

            queue.enqueue(7);
            
            
          

       
          
            queue.print();
    }
}