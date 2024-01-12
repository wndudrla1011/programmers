package level2.두큐합같게만들기;

import java.util.*;

public class Solution {

    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;
        for (int i : queue1) {
            q1.offer(i);
            sum1 += i;
        }

        for (int i : queue2) {
            q2.offer(i);
            sum2 += i;
        }

        int size = q1.size() * 3;

        while (sum1 != sum2) {
            if (sum1 < sum2) {
                int num = q2.poll();
                q1.offer(num);
                sum1 += num;
                sum2 -= num;
            } else {
                int num = q1.poll();
                q2.offer(num);
                sum1 -= num;
                sum2 += num;
            }
            if (answer >= size) return -1;
            if (q1.isEmpty() || q2.isEmpty()) return -1;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 3, 1, 15, 3}, new int[]{2, 2, 1, 1, 1}));
    }

}
