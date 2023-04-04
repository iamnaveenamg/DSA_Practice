package Arrays;

class MidSumOfArray {
    public static void main(String args[]) {
        int N = 5;
        int Ar1[] = { 1, 12, 15, 26, 38 };
        int Ar2[] = { 2, 13, 17, 30, 45 };
        System.out.println(findMidSum1(Ar1, Ar2, N));
        System.out.println(findMidSum(Ar1, Ar2, N));
    }

    static int findMidSum1(int[] ar1, int[] ar2, int n) {
        // code here
        // 1,2,4,4,5,6,6,9,10,12
        // 0,1,2,3,4,5,6,7,8,9
        int m = n;
        int z = n;
        int i = 0;
        int j = 0;
        int arr[] = new int[2 * n];
        int index = 0;
        while (i < n && j < m) {
            if (ar1[i] < ar2[j]) {
                arr[index++] = ar1[i++];
            } else {
                arr[index++] = ar2[j++];
            }
        }
        while (i < n) {
            arr[index++] = ar1[i++];
        }
        while (j < m) {
            arr[index++] = ar1[j++];
        }
        return arr[z] + arr[z - 1];
    }
    static int findMidSum(int[] ar1, int[] ar2, int n) {
        int low = 0;
        int high = n;
        while (low <= high) {
            int cut1 = low + (high - low) / 2; //2
            int cut2 = n - cut1; //3
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : ar1[cut1 - 1];
            int r1 = cut1 == n ? Integer.MAX_VALUE : ar1[cut1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : ar2[cut2 - 1];
            int r2 = cut2 == n ? Integer.MAX_VALUE : ar2[cut2];
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2) + Math.min(r1, r2);
            } else if (l1 >= r2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return -1;
    }
}