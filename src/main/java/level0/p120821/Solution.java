package level0.p120821;

import java.util.*;

public class Solution {

    public int[] solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        for (int i = num_list.length - 1; i >= 0; i--) {
            answer.add(num_list[i]);
        }

//        Collections.reverse(answer);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 1, 1, 1, 2})));
    }

}
