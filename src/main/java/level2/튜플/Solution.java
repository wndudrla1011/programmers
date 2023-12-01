package level2.튜플;

import java.util.*;

public class Solution {

    public int[] solution(String s) {
        int[] answer;
        int len = 0;
        Map<Integer, Integer> map = new HashMap<>(); //<숫자, 개수>
        StringTokenizer st = new StringTokenizer(s, "{,}");

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (map.get(n) == null) len++;
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        answer = new int[len];

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort(Comparator.comparingInt(map::get));

        for (int key : keySet) {
            answer[--len] = key;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
    }

}
