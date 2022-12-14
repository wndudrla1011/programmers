package level0.평행;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public int solution(int[][] dots) {

        Map<Double, Double> map = new HashMap<>();

        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double slope = Math.abs((double) (dots[j][1] - dots[i][1]) / (double) (dots[j][0] - dots[i][0]));
                double y_section = ((double) (dots[j][1]) - slope * dots[j][0]);
                if (map.containsKey(slope) && map.get(slope) != y_section)
                    return 1;
                map.put(slope, y_section);
                }
            }

        return 0;

    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}});
        System.out.println(result);
    }

}
