package level0.캐릭터의좌표;

import java.util.Arrays;

public class Solution {

    public int[] solution(String[] keyinput, int[] board) {
        int limitX = board[1] / 2, limitY = board[0] / 2;
        int x = 0, y = 0;

        for (String key : keyinput) {
            if (key.equals("left")) {
                if (y - 1 >= -limitY)
                    --y;
            } else if (key.equals("right")) {
                if (y + 1 <= limitY)
                    ++y;
            } else if (key.equals("down")) {
                if (x - 1 >= -limitX)
                    --x;
            } else {
                if (x + 1 <= limitX)
                    ++x;
            }
        }

        return new int[]{y, x};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));
    }

}
