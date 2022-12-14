package level0.컨트롤제트;

import java.util.Stack;

public class Solution2 {

    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }

        for (Integer i : stack) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.solution("10 Z 20 Z");
        System.out.println(result);
    }

}
