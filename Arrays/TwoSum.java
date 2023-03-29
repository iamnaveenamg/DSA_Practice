package Arrays;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static void main(String args[]) {
        int nums[] = { 2, 1, 7, 11, 15 };
        int target = 9;
        int a[] = twoSum(nums, target);
        System.out.println(Arrays.toString(a));

    }

    public static int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        int i = 0;
        int j = i + 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                ans[0] = i;
                ans[1] = j;
                break;
            } else if (j == n - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }

        return arr;
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(target - nums[i])) {
                ans[0] = hm.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            hm.put(nums[i], i);
        }
        return ans;

    }

}