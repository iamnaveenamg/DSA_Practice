package Stack;

class CircularQueue {
    private int cq[];
    private int size;
    private int r = -1;
    private int f = 0;
    private int count = 0;

    public CircularQueue(int n) {
        cq = new int[n];
        size = cq.length;
    }

    public void enQueue(int ele) {
        if (count == size) {
            System.out.println("Overflow");
        } else {
            r = (r + 1) % size;
            cq[r] = ele;
            count++;
        }
    }

    public int deQueue() {
        if (count == 0) {
            System.out.println("Queue is underFlow");
            return -1;
        }
        f = (f + 1) % size;
        count--;
        return cq[f];
    }

    public void display() {
        int f1 = f;
        if (count == 0) {
            System.out.println("System is empty");
        } else {
            for (int i = 1; i <= count; i++) {
                System.out.print(cq[f1] + " ->");
                f1 = (f1 + 1) % size;
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        CircularQueue queue = new CircularQueue(10);
        for (int i = 1; i <= 10; i++) {
            queue.enQueue(i);
        }
        queue.display();
        queue.deQueue();
        queue.deQueue();
        queue.display();
    }
}