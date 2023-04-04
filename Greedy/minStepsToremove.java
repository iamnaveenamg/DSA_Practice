package Greedy;

class minStepsToremove {
    public static void main(String args[]) {
        System.out.println(minSteps1("abababa"));

    }

    static int minSteps1(String str) {
        // Write your code here
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                count++;
            }
        }
        if (count % 2 != 0) {
            return ((count + 1) / 2) + 1;
        } else {
            return count / 2 + 1;
        }
    }

    static int minSteps(String str) {

        int acount = 0;
        int bcount = 0;
        char prev = '#';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (prev == ch)
                continue;

            if (ch == 'a')
                acount++;
            else
                bcount++;

            prev = ch;
        }

        return Math.min(acount, bcount) + 1;

    }
}