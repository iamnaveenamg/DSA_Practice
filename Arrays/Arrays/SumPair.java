package Arrays;

import java.util.Arrays;
import java.util.HashMap;

class SumPair {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        // pairs---{1,1--1,1--1,1,--3,3}
        System.out.println(numIdenticalPairs1(nums));
    }

    public static int numIdenticalPairs1(int[] nums) {
        int cnt[] = new int[101], res = 0;
        for (var n : nums){
            res += cnt[n]++;
            System.out.println("The ele:"+res);
        }
        System.out.println(Arrays.toString(cnt));
        return res;
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            if (hs.containsKey(n)) {
                int k = hs.get(n);
                count += k;
                hs.put(n, k + 1);
            } else {
                hs.put(n, 1);
            }
        }
        return count;
    }

    public int numIdenticalPairs2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}