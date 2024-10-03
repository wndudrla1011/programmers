package level0.p120817;

import java.util.Arrays;

public class Solution {

    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

}
