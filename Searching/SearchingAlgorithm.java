package Searching;

import java.util.Arrays;

class SearchingAlgorithm {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 2, 3 };
        CheckDuplicate(a);
    }

    public static void checkDuplicateBruteForce(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("The dupliacates" + a[i]);
                    return;

                }
            }
        }
        System.out.println("No duplicate");
    }

    public static void CheckDuplicate(int a[]) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println("The dupliacates" + a[i]);
                return;
            }
        }
        System.out.println("No duplicate");
    }
    

}