package Arrays;

class appearonce {
    public static void main(String args[]) {
        int N = 11;
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65 };
        int m = findOnce(arr, N);
        System.out.println(m);

    }

    public static int findOnce(int arr[], int n) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int index = 0;
        while (index < n - 1) {
            if (arr[index] != arr[index + 1]) {
                return arr[index];
            }
            index += 2;
        }
        return arr[index];
    }
}