package level1.p64061;

import java.util.Stack;

public class Solution {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> basket = new Stack<>();
        for (int pick : moves) {
            for (int depth = 0; depth < board.length; depth++) {
                if (board[depth][pick - 1] != 0) {
                    if (!basket.isEmpty() && basket.peek() == board[depth][pick - 1]) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(board[depth][pick - 1]);
                    }
                    board[depth][pick - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }

}
