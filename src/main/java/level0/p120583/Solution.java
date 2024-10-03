package level0.p120583;

import java.util.Arrays;

public class Solution {

    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(a -> a == n).count();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
    }

}
