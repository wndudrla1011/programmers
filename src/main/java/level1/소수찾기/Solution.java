package level1.소수찾기;

import java.util.*;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        int[] prime = new int[n + 1];

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            for (int j = i; i * j <= n; j++) {
                prime[i * j] = 1;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == 0)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

}
