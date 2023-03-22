import java.util.Arrays;

class StringMethods {
    public static void main(String args[]) {
        String str = "Naveen is good boy in the college";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(7));
        System.out.println(str.length());
        System.out.println(str.indexOf("c"));
        System.out.println(String.valueOf("i"));

        String str1 = " Naveen reddy Mullangichetlapalli ";
        System.out.println(str1);
        System.out.println(str1.trim());
        System.out.println(Arrays.toString(str1.split(" ")));
        System.out.println(Arrays.toString(str1.toCharArray()));
        System.out.println(str.replace("naveen", "praveen"));

    }
}