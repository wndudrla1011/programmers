package level0.p120835;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Arrays.fill(answer, 1);

        List<Integer> list = Arrays.stream(emergency)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            int max = list.stream().mapToInt(n -> n).max().orElse(0);
            int idx = list.indexOf(max);
            answer[idx] += i;
            list.set(idx, 0);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{3, 76, 24})));
    }

}
