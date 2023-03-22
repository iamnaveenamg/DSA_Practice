
public class stringClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // A-65 to Z-90
        // a-97 to z-122
        String str = "AbCdeF";
        System.out.println((int) str.charAt(1));
        char arr[] = str.toCharArray();
        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                str1 += (char) ((int) (arr[i]) + 32);
            }
            if (arr[i] >= 97 && arr[i] <= 122) {
                str1 += (char) ((int) (arr[i]) - 32);
            }
        }
        System.out.println(str1);
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                str2 += (char) (((int) (str.charAt(i)) - 32));
            }
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                str2 += (char) (((int) (str.charAt(i)) + 32));
            }
        }
        System.out.println("The output will be  :" + str2);
    }
}