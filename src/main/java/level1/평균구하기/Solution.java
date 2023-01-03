package level1.평균구하기;

import java.util.Arrays;

public class Solution {

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElseThrow();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4}));
    }

}
