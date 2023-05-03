import java.util.ArrayList;
import java.util.Arrays;

class StringProblem {
    public static void main(String[] args) {
        // String a[] = { "one", "two", "three", "four", "five", "six", "seven",
        // "eight", "nine" };
        String s = "oneninesixfourfiveone";
        Display(s);

    }   

    static void Display(String s) {
        String s1 = "";
        int sum = 0;
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));

        String a[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for (int i = 0; i < s.length(); i++) {

            if (StringAns1(s1) == false) {
                s1 += s.charAt(i);
            }
            if (StringAns1(s1) == true && list.contains(s1)) {
                sum += (list.indexOf(s1) + 1);
                s1 = "";
                System.out.println("the char :" + s1);
            }
        }
        System.out.println(sum);
    }

    static boolean StringAns1(String s) {
        String a[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
}