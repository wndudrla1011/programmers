package level2.괄호회전하기;

import java.util.Stack;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        String newS = s + s;

        for (int x = 0; x < s.length(); x++) {
            Stack<Character> stack = new Stack<>();
            boolean flag = false;
            String tmp = newS.substring(x, x + s.length());
            for (char c : tmp.toCharArray()) {
                if (c == '(' || c == '[' || c == '{')
                    stack.push(c);
                else {
                    if (stack.isEmpty()) {
                        flag = true;
                        break;
                    }
                    if (stack.peek() == '(' && c == ')' ||
                            stack.peek() == '[' && c == ']' ||
                            stack.peek() == '{' && c == '}') stack.pop();
                }
            }
            if (stack.size() == 0 && !flag) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("[)(]"));
    }

}
