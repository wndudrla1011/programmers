package level2.일이사나라의숫자;

public class Solution {

    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        while (n > 0) {
            answer = numbers[n % 3] + answer;
            n = (n - 1) / 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7));
    }

}
