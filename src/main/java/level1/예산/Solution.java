package level1.예산;

import java.util.*;

public class Solution {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if (result > budget) {
                answer = i;
                break;
            }
        }

        if (result <= budget) {
            answer = d.length;
        }

        return answer;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 3, 2, 5, 4}, 9));
    }

}
