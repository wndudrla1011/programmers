package level0.p120819;

import java.util.Arrays;

public class Solution {

    public int[] solution(int money) {
        return new int[]{money / 5500, money % 5500};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(15000)));
    }

}
