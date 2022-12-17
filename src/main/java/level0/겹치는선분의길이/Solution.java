package level0.겹치는선분의길이;

public class Solution {

    public int solution(int[][] lines) {
        int answer = 0;

        for (int i = 0; i < lines.length - 1; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                if (lines[i][0] < lines[j][0]) {
                    answer += lines[i][1] > lines[j][0] ? lines[i][1] - lines[j][0] : 0;
                } else if (lines[i][0] > lines[j][0]) {
                    answer += lines[j][1] > lines[i][0] ? lines[j][1] - lines[i][0] : 0;
                } else {
                    answer += lines[i][1] < lines[j][1] ? lines[i][1] - lines[i][0] + 1 : lines[j][1] - lines[j][0] + 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }

}
