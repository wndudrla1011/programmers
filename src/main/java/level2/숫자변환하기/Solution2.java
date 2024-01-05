package level2.숫자변환하기;

public class Solution2 {

    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];
        for (int i = x; i <= y; i++) {
            if (i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }

            if (i * 2 <= y) {
                dp[i * 2] = (dp[i * 2] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
            }

            if (i * 3 <= y) {
                dp[i * 3] = (dp[i * 3] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);
            }

            if (i + n <= y) {
                dp[i + n] = (dp[i + n] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + n]);
            }
        }
        return dp[y];
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(10, 40, 5));
    }

}
