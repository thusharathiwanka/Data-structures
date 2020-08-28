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

    public void inOrder(Node localRoot) {
        if(localRoot != null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    public void preOrder(Node localRoot) {
        if(localRoot != null) {
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    public void postOrder(Node localRoot) {
        if(localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }
}
