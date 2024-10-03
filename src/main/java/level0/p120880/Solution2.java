package level0.p120880;

import java.util.*;

public class Solution2 {

    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }

}
