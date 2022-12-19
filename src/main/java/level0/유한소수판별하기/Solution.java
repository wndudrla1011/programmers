package level0.유한소수판별하기;

public class Solution {

    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        b /= gcd;

        while (b > 1) {
            if (b % 2 == 0)
                b /= 2;
            else if (b % 5 == 0)
                b /= 5;
            else
                return 2;
        }

        return 1;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(12, 21));
    }

}
