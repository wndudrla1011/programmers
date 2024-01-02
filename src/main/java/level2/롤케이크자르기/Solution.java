package level2.롤케이크자르기;

import java.util.*;

public class Solution {

    public int solution(int[] topping) {
        int answer = 0;

        Set<Integer> first = new HashSet<>();
        Map<Integer, Integer> second = new HashMap<>();

        first.add(topping[0]);
        for (int i = 1; i < topping.length; i++) {
            second.put(topping[i], second.getOrDefault(topping[i], 0) + 1);
        }

        for (int i = 1; i < topping.length; i++) {
            first.add(topping[i]);
            second.put(topping[i], second.get(topping[i]) - 1);
            if (second.get(topping[i]) == 0) second.remove(topping[i]);
            if (first.size() == second.size()) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }

}
