class isPower2 {
    public static void main(String args[]) {
        int n = 10;
        System.out.println(isPowert(n));
    }

    public static boolean isPowert(int n) {
        if (n == 0) {
            return false;
        }
        int count = 1;
        for (int i = 1; i < n / 2; i++) {
            count *= 2;
            if (n == count) {
                return true;
            }
        }
        return false;
    }
}