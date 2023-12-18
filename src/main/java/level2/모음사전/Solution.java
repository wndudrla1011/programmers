package level2.모음사전;

import java.util.Objects;

public class Solution {

    static String[] vowels = {"A", "E", "I", "O", "U"};
    static String w;
    static int answer, idx;

    public int solution(String word) {
        w = word;
        DFS("");
        return answer;
    }

    public void DFS(String cur) {
        if (cur.length() >= 5 || Objects.equals(cur, w)) {
            if (Objects.equals(cur, w)) answer = idx;
            return;
        }
        for (int i = 0; i < 5; i++) {
            idx++;
            DFS(cur + vowels[i]);
            if (answer > 0) return;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("I"));
    }

}
