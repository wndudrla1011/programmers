package level1.p12932;

import java.util.*;

public class Solution {

    public int[] solution(long n) {
        List<Long> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        return list.stream().mapToInt(Long::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(12345)));
    }

}
