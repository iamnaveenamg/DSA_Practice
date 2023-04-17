import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

class InsertionLine {
    public static void main(String args[]) {
        int lines[][] = { { 1, 3 }, { 2, 3 }, { 1, 2 }, { 4, 4 } };
        System.out.println(maxInsertion(lines, 4));
    }

    public static int maxIntersections(int[][] lines, int N) {
        // Code here
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] line : lines) {
            int start = line[0], end = line[1] + 1;
            map.putIfAbsent(start, 0);
            map.putIfAbsent(end, 0);

            map.put(start, map.get(start) + 1);
            map.put(end, map.get(end) - 1);
        }

        int res = 0, cnt = 0;
        for (Integer value : map.values()) {
            cnt += value;
            res = Math.max(res, cnt);
        }

        return res;
    }

    public static int maxInsertion(int[][] lines, int N) {
        int[] slines = new int[N];
        int[] elines = new int[N];
        for (int i = 0; i < N; i++) {
            slines[i] = lines[i][0];
            elines[i] = lines[i][1];
        }
        Arrays.sort(slines);
        Arrays.sort(elines);
        int i = 0;
        int j = 0;
        int intersections = 0;
        int finalAns = Integer.MIN_VALUE;
        while (i < N && j < N) {
            if (slines[i] <= elines[j]) {
                intersections++;
                finalAns = Math.max(finalAns, intersections);
                i++;
            } else {
                intersections--;
                j++;
            }
        }
        return finalAns;
    }
}