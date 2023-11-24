package level2.예상대진표;

public class Solution {

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (true) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
            if (a == b) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(16, 3, 4));
    }

}
