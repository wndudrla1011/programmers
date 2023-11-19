package level2.올바른괄호;

import java.util.Stack;

public class Solution {

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("(()("));
    }

}
