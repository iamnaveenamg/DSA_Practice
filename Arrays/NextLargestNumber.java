package Arrays;

import java.util.Arrays;

class NextLargestNumber {
    public static void main(String[] args) {
        int a[] = { 19, 25, 3, 205, 5, 9, 1 };
        System.out.println(Arrays.toString(a));
        Largest(a);
        System.out.println(Arrays.toString(a));
    }

    public static void Largest(int a[]) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        int m = a[index - 1];
        int x = a[index];
        for (int i = 0; i < a.length; i++) {
            if (i == index) {
                a[i] = -1;
            }
            if (i == index + 1) {
                a[i] = x - m;
                System.out.println(m + " " + x);
            }
            if (i > index + 1) {
                a[i] = -1;
            }
            if (i < index) {
                a[i] = max;
            }
        }
    }
}