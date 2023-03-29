package Stack;

import java.util.Arrays;
import java.util.Stack;

class SpanStack {
    public static void main(String args[]) {
        int N = 7;
        int price[] = { 100, 80, 60, 70, 60, 75, 85 };
        int span[] = calculateSpan(price, N);
        System.out.println(Arrays.toString(span));
        int span1[] = calSpan(price, N);
        System.out.println(Arrays.toString(span1));
    }

    public static int[] calculateSpan(int price[], int n) {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[n];
        // stack.push(0);
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    // brute force approach
    public static int[] calSpan(int price[], int n) {
        int ans[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (price[i] >= price[j]) {
                    count++;
                } else {
                    break;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}