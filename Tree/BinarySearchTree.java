class Node {
    Node left, right;
    int data;

    public Node(int value) {
        data = value;
        left = null;
        right = null;
    }

}

class BinarySearchTree {
    Node root;
    

    public void printLeft(){
        Node currentRoot = root;
        while(currentRoot != null){
            System.out.println(currentRoot.data);
            currentRoot = currentRoot.left;
        }
    }
    public void printRight(){
        Node currentRoot = root;
        while(currentRoot != null){
            System.out.println(currentRoot.data);
            currentRoot = currentRoot.right;
        }
    }

    public static void main(String[] args){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = new Node(5);
        binarySearchTree.root.left = new Node(4);
        binarySearchTree.root.right = new Node(7);
        binarySearchTree.printLeft();
        binarySearchTree.printRight();
    }
}