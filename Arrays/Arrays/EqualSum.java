package Arrays.Arrays;

import java.util.Arrays;

class EqualSum {
    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 2, 2 };
        System.out.println(equalSum(a, a.length));
    }

    static int equalSum1(int[] A, int N) {
        int sum1 = 0;
        int sum2 = 0;
        if (N < 2) {
            return 1;
        }
        for (int i = 0; i < N; i++) {
            sum1 += A[i];
        }
        for (int i = 0; i < N; i++) {
            sum1 -= A[i];
            if (sum1 == sum2) {
                return i + 1;
            }
            sum2 += A[i];
        }
        return -1;
    }

    static int equalSum(int[] A, int N) {
        if (N == 1)
            return 1;

        int[] prefixSum = new int[N];
        prefixSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        System.out.println(Arrays.toString(prefixSum));
        for (int i = 1; i < N; i++) {
            if (prefixSum[i - 1] == prefixSum[N - 1] - prefixSum[i])
                return i + 1;
        }

        return -1;
    }
}