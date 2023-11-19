package level2.피보나치수;

public class Solution {

    static int MOD = 1234567;

    public long solution(int n) {
        long[] dp = new long[n + 1];

        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) dp[i] = mod(dp[i - 1], dp[i - 2]);

        return dp[n];
    }

    static long mod(long v1, long v2) {
        return ((v1 % MOD) + (v2 % MOD)) % MOD;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1500));
    }

}
