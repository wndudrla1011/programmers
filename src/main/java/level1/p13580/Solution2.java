package level1.p13580;

import java.util.*;

public class Solution2 {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }

}
