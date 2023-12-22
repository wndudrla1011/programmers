package level2.주식가격;

import java.util.*;

public class Solution2 {

    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int[] terms = new int[prices.length];

        stack.push(i);
        for (i = 1; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) { //가격이 하락했을 때
                int begin_idx = stack.pop(); //시작 시점
                terms[begin_idx] = i - begin_idx; //하락 시점 - 시작 시점 = 기간
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int begin_idx = stack.pop();
            terms[begin_idx] = i - begin_idx - 1;
        }

        return terms;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{2, 2, 3, 1, 5})));
    }

}
