package level0.p120897;

import java.util.*;

public class Solution {

    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                answer.add(i);
                answer.add(n / i);
            }
        }

        return answer.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(10000)));
    }

}
