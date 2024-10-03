package level0.p120824;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        long even = Arrays.stream(num_list)
                .filter(n -> n % 2 == 0)
                .count();

        long odd = Arrays.stream(num_list)
                .filter(n -> n % 2 != 0)
                .count();

        answer[0] = (int) even;
        answer[1] = (int) odd;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(new int[]{1, 3, 5, 7});
        System.out.println("result = " + Arrays.toString(result));
    }

}
