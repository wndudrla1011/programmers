package level1.콜라문제;

public class Solution {

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int ch = n % a;
            int ex = (n / a) * b;
            answer += ex;
            n = ch + ex;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 2, 20));
    }

}
