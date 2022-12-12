package level_0;

public class PaperCutting {

    static class Solution {
        public int solution(int M, int N) {
            int answer = 0;

            answer = (M - 1) + (N - 1) * M;

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(2, 5);
        System.out.println(result);
    }

}
