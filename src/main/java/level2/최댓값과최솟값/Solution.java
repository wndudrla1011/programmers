package level2.최댓값과최솟값;

import java.util.StringTokenizer;

public class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return answer + min + " " + max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("-1 -2 -3 -4"));
    }
}
