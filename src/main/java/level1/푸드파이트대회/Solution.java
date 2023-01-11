package level1.푸드파이트대회;

import java.util.Collections;

public class Solution {

    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            if (food[i] == 1) continue;
            int serve = food[i] / 2;
            while (serve-- > 0) {
                left.append(i);
                right.append(i);
            }
        }

        right.reverse();

        return left + "0" + right;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 3, 4, 6}));
    }

}
