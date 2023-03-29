package Arrays.Arrays;

import java.util.ArrayList;
import java.util.List;

class KidWithCandiesExtra {
    public static void main(String args[]) {
        int[] candies = { 11, 11 };
        int extraCandies = 3;
        List<Boolean> list = kidsWithCandies(candies, extraCandies);
        System.out.println(list);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies <= max) {
                list.add(false);
            } else {
                list.add(true);
            }
        }
        return list;
    }
}