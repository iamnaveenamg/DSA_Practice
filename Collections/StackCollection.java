package Collections;

import java.util.Stack;

class StackCollection {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack);
        for (int i : stack) {
            System.out.print(i + " ->");
        }
        //forEach(stack)
    }
}