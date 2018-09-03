
public class LinkedList<T> {

    // Create the Node head
    public Node<T> head;
    private int countElement = 0;
    

    public void insert(Node<T> item){
        //Check if the head is empty 
        if(head == null){
            // Head is Empty so we assign to it
            head = item;
            countElement++;
        } 
        else{
            // At this junction it means head is not empty we need to traverse to the end of the list to append
            Node<T> temp = head;
            while(temp.next != null){
                 temp = temp.next;
            }
            temp.next = item;
        }
    }

    public int getSize(){
        return countElement;
    }

    public void printNodes() {
        // We want to print all the nodes
        Node<T> tempNode = head;
        while (tempNode != null) {
            System.out.format("Node Content is %s \n", tempNode.data);
            tempNode = tempNode.next;
        }
        tempNode = null;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.insert(new Node<String>("Oluseyi Izzi"));
        list.insert(new Node<String>("Okeowo Aderemi"));
        list.insert(new Node<String>("Okeowo Adetayo"));
        list.insert(new Node<String>("Okeowo Adeniyi"));
        list.insert(new Node<String>("Geostigma Sephiroth"));
        list.printNodes();
    }

}

/**
 * This Represents the Node that will be a Reference to the Data it holds and
 * the next item if no item is added it is set to null to state there's no next
 * item
 */
class Node<T> {
    Node<T> next;
    T data;

    Node(T d) {
        data = d;
        next = null;
    }
}