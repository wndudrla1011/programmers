package level1.p12915;

import java.util.*;

public class Solution {

    public String[] solution(String[] s, int n) {
        Arrays.sort(s);
        String[] answer = new String[s.length];

        for (int i = 0; i < s.length; i++) {
            answer[i] = s[i].substring(n, n + 1);
        }
        Arrays.sort(answer);

        List<String> list = new ArrayList<>(Arrays.asList(s));
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).substring(n, n + 1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"bbc", "dba", "abcd", "ceo"}, 2)));
    }

}
