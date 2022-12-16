package level0.가장큰수찾기;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] array) {
        int[] answer = new int[2];

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        answer[0] = list.stream().mapToInt(n -> n).max().orElseThrow();
        answer[1] = list.indexOf(answer[0]);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 8, 3})));
    }

}
