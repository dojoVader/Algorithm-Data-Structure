
public class LinkedList<T> {

    // Create the Node head
    public Node<T> head;

    // Tail of the LinkedList this helps reduce to time complexity for adding items
    // to the LinkedList see http://opendatastuctures.com
    public Node<T> tail;
    private int countElement = 0;

    public void insert(T item) {
        // Check if the head is empty
        if (head == null) {
            // Head is Empty so we assign to it
            Node<T> itemNode = new Node<T>(item);
            head = itemNode;
            tail = itemNode;
            countElement++;
        } else {
            // At this junction it means head is not empty we need to traverse to the end of
            // the list to append
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node<T> itemNode = new Node<T>(item);
            temp.next = itemNode;
            tail = itemNode;
            countElement++;
        }
    }

    // Time Complexity O(n) as it needs to search the whole list at worse case
    // scenario
    public boolean contains(T value) {
        // Only return this when the head is null
        if (head == null) {
            return false;
        }
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int getSize() {
        return countElement;
    }

    // Delete the item from the node from the linkedlist
    public boolean delete(T d) {
        // Case 1 when the array is empty
        if (head == null) {
            return false;
        }
        // Assign to the item, we need a reference to the previous linkedList to to point to a new Address, hopefully GC should reclaim the unassigned Object
        Node<T> itemNode = head, prev = null;
        if(head.data == d){
            head = head.next;
            return true;
        }
        while (itemNode != null) {
            if (itemNode.data == d) {
                
                if (itemNode.next != null) {
                    // Re-assign the previous
                    prev.next = itemNode.next;
                    --countElement;
                    return true;
                } else {
                    prev.next = null;
                    --countElement;
                    return true;
                }

            }
            prev = itemNode;
            itemNode = itemNode.next;

        }
        return false;
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
        list.insert("Oluseyi Izzi");
        list.insert("Okeowo Aderemi");
        list.insert("Okeowo Adetayo");
        list.insert("Okeowo Adeniyi");
        list.insert("Geostigma Sephiroth");
        list.printNodes();
        if (list.contains("Okeowo Aderemix")) {
            System.out.println("Element was found in the List");
        } else {
            System.out.println("Element was not found in the List");
        }
        list.delete("Okeowo Adetayo");
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
