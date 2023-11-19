package level2.최솟값만들기;

import java.util.*;

public class Solution {

    public int solution(int []A, int []B) {
        int answer = 0;
        int len = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) answer += A[i] * B[len - i - 1];

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }

}
