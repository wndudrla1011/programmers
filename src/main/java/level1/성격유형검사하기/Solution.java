package level1.성격유형검사하기;

import java.util.*;

public class Solution {

    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            char[] type = survey[i].toCharArray();
            int score = Math.abs(choices[i] - 4);
            if (choices[i] >= 1 && choices[i] <= 3)
                map.compute(type[0], (k, v) -> (v == null) ? score : map.get(type[0]) + score);
            else if (choices[i] >= 5 && choices[i] <= 7)
                map.compute(type[1], (k, v) -> (v == null) ? score : map.get(type[1]) + score);
        }

        for (char t : types) {
            map.putIfAbsent(t, 0);
        }

        System.out.println(map);

        for (int i = 0; i < map.size(); i += 2) {
            if (map.get(types[i]) > map.get(types[i+1]))
                answer += types[i];
            else if (map.get(types[i]) < map.get(types[i+1]))
                answer += types[i + 1];
            else
                answer += (char) Math.min(types[i], types[i + 1]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));
    }

}
