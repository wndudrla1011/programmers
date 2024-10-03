package level0.p120871;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (!String.valueOf(answer).contains("3") && answer % 3 != 0) {
                continue;
            } else {
                while (String.valueOf(answer).contains("3") || answer % 3 == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(40));
    }

}
