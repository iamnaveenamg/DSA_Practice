import java.util.Arrays;


class Partitions {
    public static void main(String args[]) {
        String s = "32";
        System.out.println(minPartitions(s));

    }

    public static int minPartitions(String n) {
        int max = 0;
        char c[] = n.toCharArray();
        Arrays.sort(c);
        max = c[c.length - 1] - '0';
        // for(int i=0;i<n.length();i++){
        // int z=n.charAt(i)-'0';
        // if(z>max){
        // max=z;
        // }
        // }
        return max;

    }
}