package level0.p120889;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] sides) {
        Arrays.sort(sides);
        int max = sides[sides.length - 1];
        int others = IntStream.rangeClosed(0, sides.length - 2).map(s -> sides[s]).sum();

        if (max < others)
            return 1;
        else
            return 2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{4, 9, 9}));
    }

}
