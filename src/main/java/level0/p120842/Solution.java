package level0.p120842;

import java.util.*;

public class Solution {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        Queue<Integer> queue = new LinkedList<>();

        for (int num : num_list) {
            queue.add(num);
        }

        for (int i = 0; i < num_list.length; i++) {
            for (int j = 0; j < n; j++) {
                if (!queue.isEmpty())
                    answer[i][j] = queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }

}
