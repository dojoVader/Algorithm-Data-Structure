
public class LinkedList<T> {

    // Create the Node head
    public Node<T> head;

    public void printNodes() {
        // We want to print all the nodes
        Node<T> tempNode = head;
        while (tempNode != null) {
            System.out.format("Node Content is %s \n", tempNode.data);
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Node<String> nodeOne = new Node<String>("Okeowo");
        Node<String> nodetwo = new Node<String>("Adetayo");
        Node<String> nodeThree = new Node<String>("Adeniyi");

        //Head
        Node<String> main = new Node<String>("Seyi Izzi");

        // assign the nodes all
        nodetwo.next = nodeThree;
        nodeOne.next = nodetwo;
        list.head = main;
        list.head.next = nodeOne;

        // Print the nodes
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
