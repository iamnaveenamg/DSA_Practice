import java.util.HashMap;

class AddSubString {
    public static void main(String args[]) {
        System.out.println(GetValue("ABCD"));
    }

    public static int GetValue(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            max = Math.max(max, map.get(str.charAt(i)));
        }
        return str.length() - max;
    }

    public static int addMinChar(String str) {
        // code here
        int start = 0, end = str.length() - 1;
        int temp = end;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
            } else {
                start = 0;
                end = temp;
                temp--;
            }
            end--;
        }
        return str.length() - temp - 1;
    }
}