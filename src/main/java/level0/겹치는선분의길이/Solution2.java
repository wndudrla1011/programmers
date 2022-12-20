package level0.겹치는선분의길이;

import java.util.*;

public class Solution2 {

    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for (int[] line : lines) {
            int min = Math.min(line[0], line[1]);
            int max = Math.max(line[0], line[1]);

            for (int i = min; i < max; i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[][]{{0, 2}, {-3, -1}, {-2, 1}}));
    }

}
