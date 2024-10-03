package level1.p12928;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5));
    }

}
