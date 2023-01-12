package level1.완주하지못한선수;

import java.util.*;

public class Solution2 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant)
            map.put(p, map.getOrDefault(p, 0) + 1);

        for (String c : completion)
            map.put(c, map.get(c) - 1);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                answer += entry.getKey();
                break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }

}
