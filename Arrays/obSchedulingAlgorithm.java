package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Job {
    int JobID;
    int deadLine;
    int profit;

    Job(int JobID, int deadLine, int profit) {
        this.JobID = JobID;
        this.deadLine = deadLine;
        this.profit = profit;
    }
}

class JobSchedulingAlgorithm {
    // Function to find the maximum profit and the number of jobs done.
    public static void main(String[] args) {
        Job j1 = new Job(1, 4, 20);
        Job j2 = new Job(2, 1, 10);
        Job j3 = new Job(3, 1, 40);
        Job j4 = new Job(4, 1, 30);
        Job arr[] = { j1, j2, j3, j4 };
        // {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
        int ar[] = JobScheduling(arr, 4);
        System.out.println(Arrays.toString(ar));
        int ar1[] = JobScheduling1(arr, 4);
        System.out.println(Arrays.toString(ar1));
    }

    static int[] JobScheduling1(Job arr[], int n) {
        boolean[] jobsDone = new boolean[n];
        Arrays.fill(jobsDone, false);
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int cnt = 0, profit = 0;
        for (Job job : arr) {
            for (int i = Math.min(job.deadLine - 1, n - 1); i >= 0; i--) {
                if (!jobsDone[i]) {
                    cnt++;
                    profit += job.profit;
                    jobsDone[i] = true;
                    break;
                }
            }
        }
        return new int[] { cnt, profit };
    }

    static int[] JobScheduling(Job arr[], int n) {
        // Your code here

        PriorityQueue<Job> pq = new PriorityQueue<>(new Comparator<Job>() {
            public int compare(Job n1, Job n2) {
                if (n1.profit != n2.profit) {
                    return n2.profit - n1.profit;
                } else if (n1.deadLine != n2.deadLine) {
                    return n2.deadLine - n1.deadLine;
                }
                return n2.JobID - n1.JobID;
            }
        });
        int dlu = 0;
        Set<Integer> set = new HashSet<>();
        int cnt = 0;
        int ans = 0;
        for (Job x : arr) {
            pq.offer(x);
        }
        while (!pq.isEmpty()) {
            Job cur = pq.poll();
            while (set.contains(cur.deadLine)) {
                cur.deadLine--;
            }
            if (set.contains(cnt + 1)) {
                cnt++;
                set.remove(cnt);
            }
            if (cur.deadLine > cnt) {
                if (cur.deadLine == 1 + cnt) {
                    cnt++;
                    ans += cur.profit;
                    dlu++;
                } else {
                    set.add(cur.deadLine);
                    ans += cur.profit;
                    dlu++;
                }
            }
        }
        return new int[] { dlu, ans };
    }
}