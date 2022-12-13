package level0.잘라서배열로저장하기;

import java.util.Arrays;

public class Solution {

    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int ctr = 0;

        while (my_str.length() >= n) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < n; i++) {
                temp.append(my_str.charAt(i));
            }
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[ctr++] = temp.toString();
            my_str = my_str.substring(n);
        }

        if (my_str.length() > 0) {
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[ctr] = my_str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] result = s.solution("abcdef12345", 3);
        System.out.println(Arrays.toString(result));
    }

}
