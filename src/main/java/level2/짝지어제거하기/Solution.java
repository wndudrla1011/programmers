package level2.짝지어제거하기;

import java.util.Stack;

public class Solution {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char cur : s.toCharArray()) {
            if (stack.isEmpty()) stack.push(cur);
            else {
                if (cur == stack.peek()) stack.pop();
                else stack.push(cur);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("cdcd"));
    }

}
