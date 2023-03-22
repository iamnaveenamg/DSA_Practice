package Stack;

import java.util.Stack;

class StackPractice {
    public static void main(String args[]) {
        String str = ")()()(";
        // "(()(()))";-- working
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && stack.isEmpty()) {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not");
        }
    }
}