package level2.택배상자;

import java.util.*;

public class Solution {

    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> sub = new Stack<>(); //보조 컨테이너
        Queue<Integer> q = new LinkedList<>(); //메인 컨테이너

        for (int i = 1; i <= order.length; i++) q.offer(i);

        for (int cur : order) {
            if (!q.isEmpty() && cur == q.peek()) {
                q.poll();
            }
            else {
                if (!q.isEmpty() && q.peek() > cur && sub.peek() > cur) break;
                while (!q.isEmpty() && cur > q.peek()) {  //메인 -> 보조
                    sub.push(q.poll());
                }
                if (sub.peek() == cur) sub.pop(); //보조에서 겟
                if (!q.isEmpty() && q.peek() == cur) q.poll(); //메인에서 겟
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{5, 4, 3, 2, 1}));
    }

}
