package level1.정수제곱근판별;

public class Solution {

    public long solution(long n) {
        for (int i = 1; i <= n; i++) {
            if ((long) i * i == n)
                return (long) Math.pow(i + 1, 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1));
    }

}
