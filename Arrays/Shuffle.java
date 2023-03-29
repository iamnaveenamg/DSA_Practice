package Arrays;

import java.util.Arrays;

class Shuffle {
    public static void main(String args[]) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int a[] = shuffle1(nums, n);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(a));
    }

    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2 * n];
        int i = 0;
        int j = n;
        int k = 0;
        while (i < n && j < 2 * n) {
            arr[k++] = nums[i++];
            arr[k++] = nums[j++];
        }
        return arr;
    }

    public static int[] shuffle1(int[] nums, int n) {

        // int[] arr=new int[2*n];
        // int i=0;
        // int j=n;
        // for(int k=0;k<2*n;k=k+2){
        // arr[k]=nums[i];
        // arr[k+1]=nums[j];
        // i++;
        // j++;
        // }
        // return arr;
        int count = 0;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[count] = nums[i];
            arr[count + 1] = nums[i + n];
            count += 2;
        }
        return arr;
    }
}