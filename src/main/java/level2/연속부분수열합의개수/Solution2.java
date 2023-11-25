package level2.연속부분수열합의개수;

import java.util.*;

public class Solution2 {

    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>(); //연속 부분 수열의 합 개수
        int[] dp = new int[elements.length];

        for (int len = 1; len <= elements.length; len++) { //연속 부분 수열의 길이
            for (int i = 0; i < elements.length; i++) { //시작점
                dp[i] += elements[(len + i - 1) % elements.length];
                set.add(dp[i]);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{7, 9, 1, 1, 4}));
    }

}
