package level0.자릿수더하기;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(930211);
        System.out.println(result);
    }

}
