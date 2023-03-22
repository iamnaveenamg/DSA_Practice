package Arrays;

import java.util.Collections;

import java.util.ArrayList;

class kthElement {
    public static void main(String args[]) {
        int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        int k = 5;
        int n = arr1.length;
        int m = arr2.length;
        long kth = KthElement(arr1, arr2, n, m, k);
        System.out.println(kth);
        long kth1 = kthElment1(arr1, arr2, n, m, k);
        System.out.println(kth1);

    }

    public static long KthElement(int arr1[], int arr2[], int n, int m, int k) {
        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i : arr1) {
            al1.add(i);
        }
        for (int j : arr2) {
            al1.add(j);
        }
        Collections.sort(al1);
        long res = al1.get(k - 1);
        return res;

    }

    public static long kthElment1(int arr1[], int arr2[], int n, int m, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n || j < m) {
            if (i < n && j < m && arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else if (i < n && j < m && arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            } else if (i >= n && j < m) {
                list.add(arr2[j]);
                j++;
            } else if (j >= m && i < n) {
                list.add(arr1[i]);
                i++;
            } else {
                list.add(arr1[i]);
                list.add(arr2[j]);
                i++;
                j++;
            }

            if (list.size() >= k) {
                return (long) list.get(k - 1);
            }
        }
        return -1L;
    }
}