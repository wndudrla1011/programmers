package level0.p120862;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());

        int negativeMax = list.get(0) * list.get(1);
        int positiveMax = list.get(numbers.length - 1) * list.get(numbers.length - 2);

        return Math.max(negativeMax, positiveMax);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{0, -31, 24, 10, 1, 9}));
    }

}
