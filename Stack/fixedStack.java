package Stack;

class fixedStack implements MyStackInterface {
    private int stck[];
    private int top;

    fixedStack(int size) {
        stck = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (top == stck.length - 1) {
            System.out.println("Stack is Overflow");
        }
        stck[++top] = element;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is UnderFlow");
            return 0;
        } else {
            return stck[top--];
        }
        // size--;
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i < top + 1; i++) {
                System.out.print(stck[i] + " ");
            }
        }
    }

    public static void main(String args[]) {
        fixedStack stack = new fixedStack(10);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        stack.display();
        System.out.println("The element is pop " + stack.pop());
        stack.pop();
        stack.display();
    }
}
