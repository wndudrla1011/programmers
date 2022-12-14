package level0.평행;

import java.util.ArrayList;

public class Solution {

    public int solution(int[][] dots) {
        ArrayList<Double> incline = new ArrayList<>();

        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                if (dots[j][0] - dots[i][0] == 0) {
                    continue;
                }
                incline.add(((double) (dots[j][1] - dots[i][1]) / (dots[j][0] - dots[i][0])));
            }
        }

        if (incline.size() != incline.stream().distinct().count()) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}});
        System.out.println(result);
    }

}
