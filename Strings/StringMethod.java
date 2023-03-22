class StringMethod {
    public static void main(String args[]) {
        String str1 = "-50";
        String str2 = "-70";
        int s1 = str1.charAt(0) == 45 ? -1 : 1;
        int s2 = str2.charAt(0) == 45 ? -1 : 1;
        // System.out.println();
        // 0-48 to 9-57;
        // mus - 45
        int st1 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 48 && str1.charAt(i) <= 57) {
                st1 = st1 * 10 + (int) (str1.charAt(i) - 48);
            }

        }
        System.out.println(st1);
        int st2 = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= 48 && str2.charAt(i) <= 57) {
                st2 = st2 * 10 + (int) (str2.charAt(i) - 48);
            }
        }
        System.out.println(st2);
        s1 *= st1;
        s2 *= st2;
        int s3 = s1 + s2;
        System.out.println(s3);
        System.out.println("The value of addition is   : " + String.valueOf(s3));

    }
}