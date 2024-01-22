package level2.연속된부분수열의합;

import java.util.*;

public class Solution {

    public int[] solution(int[] A, int k) {
        int[] answer = new int[2];
        int len = Integer.MAX_VALUE; //가장 짧은 집합 길이
        int lt = 0, rt = 0;

        int sum = 0;
        while (lt <= rt) {
            if (sum > k) sum -= A[lt++];
            else {
                if (sum == k && len > rt - lt) {
                    len = rt - lt;
                    answer[0] = lt;
                    answer[1] = rt - 1;
                }
                if (rt == A.length) break;
                sum += A[rt++];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5)));
    }

}
