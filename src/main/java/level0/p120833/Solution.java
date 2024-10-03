package level0.p120833;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
    }

}
