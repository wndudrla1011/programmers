package level0.OX퀴즈;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");

            if (s[1].equals("-")) {
                if (Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }

            if (s[1].equals("+")) {
                if (Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] result = s.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        System.out.println(Arrays.toString(result));
    }

}
