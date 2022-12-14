package level0.OX퀴즈;

import java.util.Arrays;

public class Solution2 {

    public String[] solution(String[] quiz) {
        for (int i = 0; i < quiz.length; i++) {
            String[] it = quiz[i].split(" ");
            int result = Integer.parseInt(it[0]) + (Integer.parseInt(it[2]) * (it[1].equals("+") ? 1 : -1));
            quiz[i] = result == Integer.parseInt(it[4]) ? "O" : "X";
        }
        return quiz;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String[] result = s.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        System.out.println(Arrays.toString(result));
    }

}
