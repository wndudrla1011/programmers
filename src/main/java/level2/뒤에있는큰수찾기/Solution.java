package level2.뒤에있는큰수찾기;

import java.util.*;

public class Solution {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) //뒤에 있는 큰 수
                answer[stack.pop()] = numbers[i];
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{9, 1, 5, 3, 6, 2})));
    }

}
