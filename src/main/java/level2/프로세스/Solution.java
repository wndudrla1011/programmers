package level2.프로세스;

import java.util.*;

public class Solution {

    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Data> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            q.offer(new Data(i, priorities[i]));
        }

        while (!q.isEmpty()) {
            int max = 0;
            for (Data data : q) max = Math.max(max, data.rank);
            while (max != q.peek().rank) q.offer(q.poll());
            if (location == q.poll().idx) break;
            answer++;
        }

        return answer;
    }

    static class Data {
        int idx;
        int rank;

        public Data(int idx, int rank) {
            this.idx = idx;
            this.rank = rank;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

}
