package level0.피자나눠먹기2;

public class Solution {

    public int solution(int n) {
        return n / gcd(6, n);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4));
    }

}
