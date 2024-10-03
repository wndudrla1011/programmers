package level1.p86491;

public class Solution {

    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w = 0, max_h = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }

        return answer = max_w * max_h;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

}
