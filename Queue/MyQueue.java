package Queue;

public class MyQueue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    MyQueue() {
        front = -1;
        rear = -1;
    }

    // check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    // check if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // insert elements to the queue
    void enQueue(int element) {
        // if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    // delete element from the queue
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + " Deleted");
            return (element);
        }
    }

    // display element of the queue
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");
            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {
        // create an object of Queue class
        MyQueue q = new MyQueue();
        q.deQueue();
        // insert elements to the queue
        for (int i = 1; i < 6; i++) {
            q.enQueue(i);
        }
        // 6th element can't be added to queue because queue is full
        q.enQueue(6);
        q.display();
        // deQueue removes element entered first i.e. 1
        q.deQueue();
        // Now we have just 4 elements
        q.display();

    }
}