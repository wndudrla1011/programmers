package level1.p42840;

import java.util.*;

public class Solution {

    public int[] solution(int[] answers) {
        int[] score = new int[3];

        int[] first = new int[]{1, 2, 3, 4, 5};
        int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % 5]) score[0]++;
            if (answers[i] == second[i % 8]) score[1]++;
            if (answers[i] == third[i % 10]) score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) answer.add(i + 1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 3, 2, 4, 2})));
    }

}
