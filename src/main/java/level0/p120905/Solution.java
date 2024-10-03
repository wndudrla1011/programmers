package level0.p120905;

import java.util.Arrays;

public class Solution {

    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(Arrays.toString(result));
    }

}
