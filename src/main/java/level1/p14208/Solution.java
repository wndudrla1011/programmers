package level1.p14208;

import java.util.Arrays;

public class Solution {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        int[] check = new int[26];
        Arrays.fill(check, -1);

        char[] word = s.toCharArray();
        for (int i = 0; i < word.length; i++) {
            int idx = word[i] - 97;
            if (check[idx] == -1)
                answer[i] = -1;
            else
                answer[i] = i - check[idx];

            check[idx] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("banana")));
    }

}
