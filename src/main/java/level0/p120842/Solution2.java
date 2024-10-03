package level0.p120842;

import java.util.Arrays;

public class Solution2 {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.deepToString(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }

}
