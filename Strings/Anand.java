import java.util.ArrayList;
import java.util.Arrays;

class Anand {
    public static void main(String[] args) {
        String str = "$%AB#N";
        System.out.println(ReverseString(str));
        String str1 = "!@6AD$YY";
        System.out.println(ReverseString(str1));
    }

    static String ReverseString(String str) {
        int start = 0;
        int end = str.length() - 1;
        String str1 = "";
        char ch[] = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        while (start <= end) {
            char ch1 = ch[start];
            char ch2 = ch[end];
            if (Character.isLetter(ch1) && Character.isLetter(ch2)) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            } else if (Character.isLetter(ch1) && (!Character.isLetter(ch2))) {
                end--;
            } else if ((!Character.isLetter(ch1)) && Character.isLetter(ch2)) {
                start++;
            }
        }
        System.out.println(Arrays.toString(ch));
        for (char c : ch) {
            str1 += c;
        }
        return str1;
    }
}