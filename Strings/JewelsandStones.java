import java.util.HashMap;
import java.util.HashSet;

class JewelsandStones {
    public static void main(String args[]) {
        String jewels = "z", stones = "ZZZZZ";
        System.out.println(numJewelsInStones1(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int numJewelsInStones1(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            if (map.containsKey(jewels.charAt(i))) {
                map.put(jewels.charAt(i), map.get(jewels.charAt(i)) + 1);
            } else {
                map.put(jewels.charAt(i), 1);
            }
        }
        for (int i = 0; i < stones.length(); i++) {
            if (map.containsKey(stones.charAt(i))) {
                count += map.get(stones.charAt(i));
            }
        }
        return count;
    }
}