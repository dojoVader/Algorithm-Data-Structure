
public class LinkedList<T> {

    // Create the Node head
    public Node head;

    public void printNodes() {
        // We want to print all the nodes
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.format("Node Content is %s \n", tempNode.data);
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node nodeOne = new Node("Okeowo");
        Node nodetwo = new Node("Adetayo");
        Node nodeThree = new Node("Adeniyi");

        // assign the nodes all
        nodetwo.next = nodeThree;
        nodeOne.next = nodetwo;
        list.head = new Node("Seyi Izzi");
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
