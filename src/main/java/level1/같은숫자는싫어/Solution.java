package level1.같은숫자는싫어;

import java.util.*;

public class Solution {

    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int a : arr) {
            if (stack.isEmpty()) {
                stack.add(a);
            } else {
                if (stack.peek() != a) {
                    stack.add(a);
                }
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }

}
