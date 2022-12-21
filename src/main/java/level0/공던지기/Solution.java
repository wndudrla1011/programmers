package level0.공던지기;

public class Solution {

    public int solution(int[] numbers, int k) {
        int answer = 0, ctn = 1;

        for (int i = 1; ctn <= k; i += 2) {
            answer = i % numbers.length;
            ctn++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3}, 3));
    }

}
