package level2.택배상자;

import java.util.*;

public class Solution2 {

    public int solution(int[] order) {
        int cnt = 0;
        Stack<Integer> sub = new Stack<>();
        Queue<Integer> main = new LinkedList<>();

        for (int i = 0; i < order.length; i++) {
            sub.push(i + 1);

            while (!sub.isEmpty()) {
                if (sub.peek() == order[cnt]) {
                    main.offer(sub.pop());
                    cnt++;
                }
                else break;
            }
        }

        return main.size();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{5, 4, 3, 2, 1}));
    }

}
