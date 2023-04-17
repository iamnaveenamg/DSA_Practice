package Collections;

import java.util.ArrayList;

class RangePrime {
    public static void main(String args[]) {
        int n = 100;
        rangeCheck(n);
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void rangeCheck(int n) {
        // ArrayList<Integer> list = new ArrayList<>();
        //int m = 0;
        if (n < 2) {
            return;
        }
        if (isPrime(n)) {
            System.out.print(n + " ->");
            //m = n - 1;
            rangeCheck(n-1);
        } else {
            //m = n - 1;
            rangeCheck(n-1);
        }

    }
}