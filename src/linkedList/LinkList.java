package linkedList;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public void displayList() {
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
