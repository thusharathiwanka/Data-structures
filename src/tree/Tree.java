package tree;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int id, int dData) {
        Node newNode = new Node();
        newNode.id = id;
        newNode.dData = dData;

        if(root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;

                if(id < current.id) {
                    current = current.leftChild;

                    if(current == null) {
                        parent.leftChild = newNode;
                    }
                } else {
                    current = current.rightChild;

                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node find(int id) {
        Node current = root;

        while (current.id != id) {
            if(id < current.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if(current == null) {
                return null;
            }
        }
        return current;
    }

    private void inOrder(Node localRoot) {
        if(localRoot != null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    public void TraverseInOrder() {
        inOrder(root);
    }

    private void preOrder(Node localRoot) {
        if(localRoot != null) {
            localRoot.displayNode();
            inOrder(localRoot.leftChild);
            inOrder(localRoot.rightChild);
        }
    }

    public void TraversePreOrder() {
        preOrder(root);
    }

    private void postOrder(Node localRoot) {
        if(localRoot != null) {
            inOrder(localRoot.leftChild);
            inOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }

    public void TraversePostOrder() {
        postOrder(root);
    }
}
