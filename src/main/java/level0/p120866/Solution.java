package level0.p120866;

import java.util.Arrays;

public class Solution {

    public int solution(int[][] board) {
        int length = board.length;
        int[][] check = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == 1) {
                    dangerous(check, i, j);
                }
            }
        }

        return (int) Arrays.stream(check).flatMapToInt(Arrays::stream).filter(elem -> elem == 0).count();
    }

    private void dangerous(int[][] check, int row, int vertical) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (row + i >= 0 && row + i <= check.length - 1 && vertical + j >= 0 && vertical + j <= check.length - 1)
                    check[row + i][vertical + j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
    }

}
