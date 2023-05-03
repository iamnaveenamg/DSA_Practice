class MergeString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xyz";
        System.out.println(mergeAlternately2(s1, s2));
    }

    public static String mergeAlternately2(String word1, String word2) {
        int m1 = word1.length(), m2 = word2.length(), i = 0, j = 0;
        StringBuffer sb = new StringBuffer();
        while (i < m1 || j < m2) {
            if (i < word1.length())
                sb.append(word1.charAt(i++));
            if (j < word2.length())
                sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }

    public static String mergeAlternately1(String word1, String word2) {
        int i = 0, j = 0, k = 0;
        String st = "";
        while (i < word1.length() && j < word2.length()) {
            if (k % 2 == 0) {
                st += word1.charAt(i++);
                k++;
            } else {
                st += word2.charAt(j++);
                k++;
            }
        }
        while (i < word1.length()) {
            st += word1.charAt(i++);
        }
        while (j < word2.length()) {
            st += word2.charAt(j++);
        }
        return st;
    }

    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, k = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() && j < word2.length()) {
            if (k % 2 == 0) {
                sb.append(word1.charAt(i++));
                k++;
            } else {
                sb.append(word2.charAt(j++));
                k++;
            }
        }
        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}