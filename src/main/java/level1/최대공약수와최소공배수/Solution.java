package level1.최대공약수와최소공배수;

import java.util.Arrays;

public class Solution {

    public int[] solution(int n, int m) {
        return new int[]{gcd(n, m), (n * m) / gcd(n, m)};
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, 12)));
    }

}
