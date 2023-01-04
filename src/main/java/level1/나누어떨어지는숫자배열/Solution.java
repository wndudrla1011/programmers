package level1.나누어떨어지는숫자배열;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(n -> n % divisor == 0).sorted().toArray();
        return answer.length > 0 ? answer : new int[]{-1};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{5, 9, 7, 10}, 5)));
    }

}
