package Arrays;

import java.util.Arrays;

class threeWayPartition {
    public static void main(String args[]) {
        int A[] = { 1, 8, 2, 3, 3, 8, 4 };
        int a = 1, b = 2;
        System.out.println(Arrays.toString(A));
        threeWayPartitionMethod(A, a, b);
        System.out.println(Arrays.toString(A));
    }

    public static void threeWayPartitionMethod(int arr[], int a, int b) {
        // code here
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a) {
                swap(arr, index, i);
                index++;
            }
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                swap(arr, index, i);
                index++;
            }
        }
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}