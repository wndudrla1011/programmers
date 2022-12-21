package level0.구슬을나누는경우의수;

import java.math.BigInteger;

public class Solution2 {

    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(10, 4));
    }

}
