package Arrays;

import java.util.HashMap;

class GetCount {
    public static void main(String args[]) {
        int N = 6, K = 6;
        int arr[] = { 1, 5, 1, 7, 1, 1 };
        int m = getPairsCount(arr, N, K);
        System.out.println("The answer:");
        System.out.println(m);
    }

    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i])) {
                // If the hashmap will contains the those values then we can count the values
                // associated with it.
                count += map.get(k - arr[i]);
                System.out.println(arr[i] + " This pair " + (k - arr[i]));
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        return count;
    }
}