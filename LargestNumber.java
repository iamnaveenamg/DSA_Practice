import java.util.Arrays;

class LargestNumber {
    public static void main(String[] args) {
        int a[] = { 20, 35, 15, 203, 9, 1, 5 };
        System.out.println(Arrays.toString(a));
        LargetPart(a);
        System.out.println(Arrays.toString(a));
    }

    static void LargetPart(int a[]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                a[i - 1] = -1;
            }
        }
    }
}