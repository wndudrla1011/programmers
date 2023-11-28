package level2.nx2배열자르기;

import java.util.*;

public class Solution {

    public List<Long> solution(int n, long left, long right) {
        List<Long> list = new ArrayList<>();

        for (long i = left; i <= right; i++) {
            list.add(Math.max(i / n, i % n) + 1);
        }

        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 2, 5));
    }

}
