package level1.p70128;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
    }

}
