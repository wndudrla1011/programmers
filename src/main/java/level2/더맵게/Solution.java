package level2.더맵게;

import java.util.*;

public class Solution {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int sc : scoville) pq.offer(sc);

        while (pq.peek() < K) {
            if (pq.size() < 2) return -1;
            int first = pq.poll();
            int second = pq.poll();
            pq.offer(first + second * 2);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

}
