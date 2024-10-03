package level1.p13580;

import java.util.*;

public class Solution {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        score = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        Queue<Integer> queue = new LinkedList<>();
        for (int s : score) {
            queue.add(s);
        }

        List<Integer> box = new ArrayList<>();
        for (int i = 0; i < score.length / m; i++) {
            for (int j = 0; j < m; j++)
                box.add(queue.poll());
            answer += box.get(box.size() - 1) * m;
            box.clear();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }

}
