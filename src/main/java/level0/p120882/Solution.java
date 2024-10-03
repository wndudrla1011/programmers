package level0.p120882;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[][] score) {
        ArrayList<Integer> sum = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            sum.add(Arrays.stream(score[i]).sum());
        }

        Integer[] integerAnswer = sum.stream()
                .map(i -> sum.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1)
                .toArray(Integer[]::new);

        return Arrays.stream(integerAnswer).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
    }

}
