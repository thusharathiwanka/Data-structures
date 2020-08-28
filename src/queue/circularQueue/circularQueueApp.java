package queue.circularQueue;

class Queue {
    private int queueSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int noOfItems;

    public Queue(int queueSize) {
        this.queueSize = queueSize;
        queueArray = new int[queueSize];
        front = 0;
        rear = -1;
        noOfItems = 0;
    }

    public void insert(int item) {
        if(noOfItems == queueSize) {
            System.out.println("Queue is full");
            System.exit(0);
        } else {
            if(rear == queueSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = item;
            noOfItems++;
        }
    }

    public int remove() {
         if(noOfItems == 0) {
             System.out.println("Queue is empty");
             return -99;
         } else {
             int temp = queueArray[front++];
             if(front == queueSize) {
                 front = 0;
             }
             noOfItems--;
             return temp;
         }
    }

    public int peekFront() {
       if(noOfItems == 0) {
           System.out.println("Queue is empty");
           return -99;
       } else {
           return queueArray[front];
       }
    }

    public boolean isEmpty() {
        return (noOfItems == 0);
    }

    public boolean isFull() {
        return (noOfItems == queueSize);
    }
}

public class circularQueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        System.out.println("Front: " + queue.peekFront());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
