package level0.구슬을나누는경우의수;

import java.math.BigInteger;

public class Solution {

    public BigInteger solution(int balls, int share) {
        return factorial(balls).divide(factorial(balls-share).multiply(factorial(share)));
    }

    private BigInteger factorial(int num) {
        BigInteger ret = new BigInteger("1");
        BigInteger from = new BigInteger("1");
        BigInteger to = new BigInteger(String.valueOf(num));

        for (BigInteger i = from; i.compareTo(to) <= 0; i = i.add(BigInteger.ONE)) {
            ret = ret.multiply(i);
        }

        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(30, 20));
    }

}
