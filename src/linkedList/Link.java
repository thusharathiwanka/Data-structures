package linkedList;

public class Link {
    public int iData;
    public Link next;

    public Link(int data) {
        iData = data;
        next = null;
    }

    public void displayLink() {
        System.out.println(iData);
    }
}
