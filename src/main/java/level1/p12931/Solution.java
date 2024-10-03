package level1.p12931;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += (n % 10);
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(123));
    }

}
