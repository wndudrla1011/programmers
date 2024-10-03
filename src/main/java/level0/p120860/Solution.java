package level0.p120860;

import java.util.Stack;

public class Solution {

    public int solution(int[][] dots) {
        int x = 0, y = 0;

        Stack<int[]> stack = getDots(dots);
        int[] xy = stack.pop();

        for (int[] elem : stack) {
            if (elem[1] == xy[1]) {
                x = Math.abs(elem[0] - xy[0]);
            }
            if (elem[0] == xy[0]) {
                y = Math.abs(elem[1] - xy[1]);
            }
        }

        return x * y;
    }

    private Stack<int[]> getDots(int[][] dots) {
        Stack<int[]> stack = new Stack<>();

        for (int[] array : dots) {
            stack.push(array);
        }
        return stack;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }

}
