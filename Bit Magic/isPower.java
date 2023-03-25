class isPower{
    public static void main(String args[]){
        long n=2;
        System.out.println(isPowerofTwo(n));
    }
    public static boolean isPowerofTwo(long n){   
        // Your code here
        if(n==0){
            return false;
        }
        return (n&(n-1))==0;
    }
}