package level1.나머지가1이되는수찾기;

import java.util.*;

public class Solution {

    public int solution(int n) {
        List<Integer> x = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if ((n - 1) % i == 0) {
                x.add(i);
            }
        }

        x.sort(Comparator.naturalOrder());

        return x.get(0);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

}
