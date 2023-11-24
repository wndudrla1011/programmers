package level2.귤고르기;

import java.util.*;

public class Solution {

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>(); //<번호, 개수>

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2) - map.get(o1));

        for (int num : keySet) {
            k -= map.get(num);
            answer++;
            if (k <= 0) break; //상자 fulled
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }

}
