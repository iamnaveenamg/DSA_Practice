package Arrays;

import java.util.Arrays;

class CyclicRotate {
    public static void main(String args[]) {
        int N = 5;
        int A[] = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(A));
        rotate(A, N);
        System.out.println(Arrays.toString(A));

    }

    public static void rotate(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;
        }

    }
}