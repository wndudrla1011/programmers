package level0.p120890;

import java.util.*;

public class Solution {

    public int solution(int[] array, int n) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int v : array) {
            map.put(v, Math.abs(n - v));
        }

        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (min > entry.getValue()) {
                min = entry.getValue();
                answer = entry.getKey();
            } else if (min == entry.getValue()) {
                if (answer > entry.getKey())
                    answer = entry.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 10, 12, 28}, 20));
    }

}
