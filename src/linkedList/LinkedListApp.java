package linkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.insertFirst(1);
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        linkList.insertFirst(4);
        linkList.insertFirst(5);

        linkList.displayList();
        System.out.println();

        linkList.insertAfter(2, 8);

        linkList.displayList();
        System.out.println();

        while (!linkList.isEmpty()) {
            System.out.println(linkList.deleteFirst().iData + " deleted");
        }
    }
}
