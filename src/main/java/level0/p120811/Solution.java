package level0.p120811;

import java.util.Arrays;

public class Solution {

    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 7, 10, 11}));
    }

}
