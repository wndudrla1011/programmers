package level1.나머지가1이되는수찾기;

import java.util.stream.IntStream;

public class Solution2 {

    public int solution(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(10));
    }

}
