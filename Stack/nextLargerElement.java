package Stack;

import java.util.Arrays;
import java.util.Stack;

class nextLargerElement {
    public static void main(String args[]) {
        int N = 5;
        long arr[] = { 6, 8, 0, 1, 3 };
        System.out.println(Arrays.toString(arr));
        long ar[] = nextLargerElement2(arr, N);
        System.out.println(Arrays.toString(ar));
    }

    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement1(long[] arr, int n) {
        // Your code here
        long[] ar = new long[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            long t = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    t = arr[j];
                    break;
                }
            }
            ar[index++] = t;
        }
        return ar;
    }

    static long[] nextLargerElement2(long[] arr, int n) {
        long[] ar = new long[arr.length];
        int index = 0;
        Stack<Long> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack.size() == 0) {
                ar[i] = -1;
            } else if (stack.size() > 0 && stack.peek() > arr[i]) {
                ar[i] = stack.peek();
            } else {
                while (stack.size() > 0 && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    ar[i] = -1;
                } else {
                    ar[i] = stack.peek();
                }
            }
            stack.push(arr[i]);
        }
        return ar;

    }
}