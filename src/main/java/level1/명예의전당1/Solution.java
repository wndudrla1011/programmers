package level1.명예의전당1;

import java.util.*;

public class Solution {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> fame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            fame.add(score[i]);
            if (fame.size() > k)
                fame.poll();
            if (fame.peek() != null)
                answer[i] = fame.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }

}
