package level0.소인수분해;

import java.util.*;

public class Solution {

    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            prime.add(i);
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            int j = 2;
            while (i * j <= n) {
                prime.remove(Integer.valueOf(i * j));
                j++;
            }
        }

        for (Integer p : prime) {
            if (n % p == 0)
                answer.add(p);
        }

        return answer.stream().distinct().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(12)));
    }

}
