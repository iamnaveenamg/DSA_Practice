import java.util.Arrays;
import java.util.HashMap;

class StringProblems {
    public static void main(String[] args) {
        System.out.println(GetHighestFrequencyLetter("hello"));
        System.out.println(getString("hello hi bye namasthe"));
        System.out.println(GetHighestFirst("bye bye hi eyb hi bye"));
        System.out.println(getValueOfString("hi hello ji hlo"));
    }

    static char GetHighestFrequencyLetter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        // char ch=(Character) null;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) > max) {
                max = i;
            }
        }
        return s.charAt(max);
    }

    static String getString(String s) {
        String[] str = s.split(" ");
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > str[max].length()) {
                max = i;
            }
        }
        return str[max];
    }

    static int GetHighestFirst(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        // char ch=(Character) null;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) > max) {
                if (max == map.get(s.charAt(i)) || s.charAt(i) == ' ') {
                    continue;
                }

                max = map.get(s.charAt(i));
            }
        }
        // System.out.println("the char: " + s.charAt(max) + " this will be");
        return max;
    }

    static String reverseString(String s) {
        int n = s.length() - 1;
        String st = "";
       for(int i=n;i>=0;i--){
        st+=s.charAt(i);
       }
        return st;
    }

    static String[] ReverseStringArray(String s[]) {
        String s1[] = new String[s.length];
        int index = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            s1[index++] = s[i];
        }
        return s1;
    }

    static String getValueOfString(String s) {
        String st = "";
        String s1[] = s.split(" ");
        String s2[] = ReverseStringArray(s1);
        System.out.println(Arrays.toString(s2));
        for (int i = 0; i < s2.length; i++) {
            if (i % 2 == 0) {
                st += reverseString(s2[i]) + " ";
            } else {
                st += s2[i] + " ";
            }
        }
        return st;
    }
}