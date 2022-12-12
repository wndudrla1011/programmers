package level0.종이자르기;

public class Solution {

    public int solution(int M, int N) {
        int answer = 0;

        answer = (M - 1) + (N - 1) * M;

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(2, 5);
        System.out.println(result);
    }

}
