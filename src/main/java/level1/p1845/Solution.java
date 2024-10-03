package level1.p1845;

import java.util.Arrays;

public class Solution {

    public int solution(int[] nums) {
        int cnt = (int) Arrays.stream(nums).distinct().count();

        if (cnt == nums.length / 2) {
            return nums.length / 2;
        } else if (cnt > nums.length / 2) {
            return nums.length / 2;
        } else {
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 3, 3, 2, 2, 4}));
    }

}
