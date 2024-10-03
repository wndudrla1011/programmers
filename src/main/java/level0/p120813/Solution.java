package level0.p120813;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(15)));
    }

}
