package tree;

public class Node {
    public int id;
    public double dData;
    public Node leftChild;
    public Node rightChild;

    public void displayNode() {
        System.out.println("{");
        System.out.println(id);
        System.out.println(",");
        System.out.println(dData);
        System.out.println("}");
    }
}
