package level2.삼각달팽이;

import java.util.Arrays;

public class Solution {

    public int[] solution(int n) {
        int size = (1 + n) * n / 2;
        int[] answer = new int[size];
        int[][] A = new int[n][n];

        int x = -1, y = 0;
        int order = 1;

        for (int i = 0; i < n; i++) { //방향
            for (int j = i; j < n; j++) { //길이
                if (i % 3 == 0) x++;
                else if (i % 3 == 1) y++;
                else {
                    x--; y--;
                }
                A[x][y] = order++;
            }
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) break;
                answer[idx++] = A[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(4)));
    }

}
