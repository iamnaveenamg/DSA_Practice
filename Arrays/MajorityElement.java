package Arrays;

import java.util.*;

class MajorityElement {

    public static void main(String args[]) {
        int a[] = { 3, 2, 3 };
        int m = majorityElement1(a);
        System.out.println(m);

    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int MajorityElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                MajorityElement = nums[i];
            }
            if (MajorityElement == nums[i]) {
                count++;
            } else {
                count -= 1;
            }
        }
        return MajorityElement;
    }

    public static int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            // map.containsKey(nums[i]) && map.get(nums[i]).intValue() > nums.length / 2)
            if (map.containsKey(nums[i]) && map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}