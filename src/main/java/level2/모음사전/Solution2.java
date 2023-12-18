package level2.모음사전;

import java.util.*;

public class Solution2 {

    List<String> list = new ArrayList<>();

    public int solution(String word) {
        DFS(0, "");
        return list.indexOf(word);
    }

    public void DFS(int len, String cur) {
        if (len > 5) return;
        list.add(cur);
        for (int i = 0; i < 5; i++) {
            DFS(len + 1, cur + "AEIOU".charAt(i));
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("I"));
    }

}
