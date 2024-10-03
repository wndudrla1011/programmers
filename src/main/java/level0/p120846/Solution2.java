package level0.p120846;

import java.util.stream.IntStream;

public class Solution2 {

    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(15));
    }

}
