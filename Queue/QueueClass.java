package Queue;

class QueueClass {
    int queue[];
    int size;
    int front = 0;
    int rear = -1;
    int size1;

    QueueClass(int size) {
        this.size = size;
        queue = new int[size];
        size1 = 0;
    }

    public void EnQueue(int ele) {
        if (rear == size - 1 || size == size1) {
            System.out.println("Over Flow of Queue");
        } else {
            queue[++rear] = ele;
            size1++;
        }
    }

    public int DeQueue() {
        if (rear == -1 || front > rear || size1 == 0) {
            System.out.println("Queue is underFlow");
            return -1;
        } else {
            int data = queue[front];
            front++;
            size1--;
            return data;
        }
    }

    public boolean isEmpty() {
        return size1 == 0;
    }

    public int size() {
        return size1;
    }

    public void display() {
        if (size1 <= 0) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = 0; i < size1; i++) {
                System.out.print(queue[front + i] + "-->");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        QueueClass queue = new QueueClass(10);
        queue.EnQueue(10);
        queue.EnQueue(20);
        queue.EnQueue(30);
        queue.EnQueue(40);
        queue.EnQueue(50);
        queue.display();
        System.out.println(queue.DeQueue());
        queue.DeQueue();
        queue.display();
    }
}