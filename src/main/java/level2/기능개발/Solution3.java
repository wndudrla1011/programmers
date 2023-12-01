package level2.기능개발;

import java.util.*;

public class Solution3 {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {
                list.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        list.add(q.size());

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(Arrays.toString(s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
    }

}
