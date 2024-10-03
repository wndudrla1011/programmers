package level0.p120808;

import java.util.Arrays;

public class Solution {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int denominator = num1 * num2;
        int numerator = denum1 * num2 + denum2 * num1;

        int gcd = gcd(numerator, denominator);

        System.out.println(gcd);

        answer[0] = numerator / gcd;
        answer[1] = denominator / gcd;

        return answer;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(9, 2, 1, 3);
        System.out.println(Arrays.toString(result));
    }

}
