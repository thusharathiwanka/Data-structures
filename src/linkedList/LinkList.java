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

    public Link findLink(int key) {
        Link current = first;

        while(current != null) {
            if(current.iData == key) {
                return current;
            } else {
                current = current.next;
            }
        }
        System.out.println("Not found key");
        return null;
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public void insertAfter(int key, int newData) {
        Link newLink = new Link(newData);
        Link current = first;

        while (current.next != null) {
            if(current.iData == key) {
                newLink.next = current.next;
                current.next = newLink;

                return;
            } else {
                current = current.next;
            }
        }
        System.out.println("No found the key");
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
