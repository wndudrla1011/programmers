package level0.p120846;

import java.util.*;

public class Solution {

    public int solution(int n) {
        List<Integer> prime = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            prime.add(i);
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            int j = 2;
            while (i * j <= n) {
                prime.remove(Integer.valueOf(i * j));
                j++;
            }
        }

        return n - prime.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(15));
    }

}
