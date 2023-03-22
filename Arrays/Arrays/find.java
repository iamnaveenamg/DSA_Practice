package Arrays;

import java.util.ArrayList;

public class find {
    public static void main(String args[]) {
        int n = 9, x = 5;
        long arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(find1(arr, n, x));

    }

    public static ArrayList<Long> find1(long arr[], int n, int x) {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        long first = 0, last = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                first = i;
                al.add(first);
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == x) {
                last = i;
                al.add(last);
                break;
            }
        }
        if (al.size() == 0) {
            al.add(Long.valueOf(-1));
            al.add(Long.valueOf(-1));
        }
        return al;
    }
}
