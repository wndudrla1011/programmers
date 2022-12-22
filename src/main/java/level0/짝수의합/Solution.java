package level0.짝수의합;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

}
