package level2.예상대진표;

public class Solution2 {

    public int solution(int n, int a, int b) {
        int answer = 0;
        int round = (int) (Math.log(n) / Math.log(2));

        for (int i = 1; i <= round; i++) {
            a = a % 2 == 0 ? a / 2 : a / 2 + 1;
            b = b % 2 == 0 ? b / 2 : b / 2 + 1;
            if (a == b) break;
            else answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(8, 4, 7));
    }

}
