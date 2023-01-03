package level1.정수제곱근판별;

public class Solution {

    public long solution(long n) {
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if ((int) Math.pow(i,2) == n)
                return (long) Math.pow(i + 1, 2);
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1));
    }

}
