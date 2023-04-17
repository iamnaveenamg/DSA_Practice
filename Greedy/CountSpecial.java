package Greedy;

import java.util.HashMap;

class CountSpecial {
    public static void main(String args[]) {
        int N = 4;
        int arr[] = { 5, 5, 5, 5 };
        System.out.println(CountSpecial.countSpecialNumbers1(N, arr));
        System.out.println(CountNumber(N,arr));
    }

    public static int countSpecialNumbers(int N, int arr[]) {
        // Code
        int count = 0;
        for (int i = 0; i < N; i++) {
            int count1 = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i] % arr[j] == 0) {
                    count1++;
                }
            }
            if (count1 == N) {
                count++;
            }
            count1 = 0;
        }
        return count;
    }
    public static int CountNumber(int N, int arr[]){
        HashMap<Integer, Boolean> map=new HashMap<>();
        int ans=0;
        boolean res[]=new boolean[N];
        for(int i=0;i<N;i++){
            for(int j=0;i<N;j++){
                if(i!=j && arr[i]%arr[j]==0){
                    res[i]=true;
                    break;
                }
            }
            map.put(arr[i], res[i]);
        }
        for(int i=0;i<N;i++){
            if(res[i]){
                ans++;
            }
        }
        return ans;
    }
    public static int countSpecialNumbers1(int N, int arr[]) {
        // Code here
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        int count = 0;
        int max=Integer.MIN_VALUE;
        for(int ar:arr){
            max=Math.max(max,ar);
        }
        boolean fact[]=new boolean[max+1];
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
                continue;
            }
            for(int j=2*arr[i];j<=max;j+=arr[i]){
                fact[j]=true;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:arr){
            if(fact[i] || map.get(i)>1){
                count++;
            }
        }
        return count;
    }
}