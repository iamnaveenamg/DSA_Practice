import java.util.HashSet;
import java.util.Set;

class OptimalPartitionofString {
    public static void main(String args[]) {
        System.out.println(partitionString("ssssss"));
    }

    public static int partitionString(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // char at that index present in the hashset
            if (hs.contains(s.charAt(i))) {
                // increase the count by 1
                count++;
                hs.clear();
            }
            hs.add(s.charAt(i));
        }
        return count + 1;
    }
    public static int partitionString1(String s) {
        if(s.length() == 1) return 1;
          
          Set<Character> set = new HashSet<>();
          int cnt = 1, index = 0, n = s.length();
          char[] ch = s.toCharArray();
          
          while(index < n){
            char c = ch[index++];
            if(!set.contains(c)) set.add(c);
            else{
               set.clear();
               set.add(c);
               cnt++;
            }
          }
          return cnt;
      }
}