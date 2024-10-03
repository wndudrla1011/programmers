package level0.p120809;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(n -> n * 2).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5})));
    }

}
