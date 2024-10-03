package level0.p120831;

import java.util.stream.IntStream;

public class Solution2 {

    public int solution(int n) {
        return IntStream.rangeClosed(0, n).filter(e -> e % 2 == 0).sum();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(10));
    }

}
