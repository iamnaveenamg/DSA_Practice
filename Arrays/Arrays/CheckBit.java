package Arrays;

class CheckBit {
    public static void main(String args[]) {
        int N = 500, K = 3;
        System.out.println(checkKthBit1(N, K));

    }

    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int count = 0;
        while (n > 0) {
            int rem = n % 2;
            if (count == k + 1 && rem == 1) {
                return true;
            }
            count++;
            n /= 2;
        }
        return false;
    }
    static boolean checkKthBit1(int n, int k)
    {
        // Your code here
        // int count=0;
        // while(n>0){
        //     int rem=n%2;
        //     if(count==k+1 && rem==1){
        //         return true;
        //     }
        //     count++;
        //     n/=2;
        // }
        // return false;
        boolean bb=false;
        int bitmask=1<<k;
        if((bitmask&n)!=0){
            bb=true;
        }else{
            bb=false;
        }
        return bb;
    }

}