package level2.숫자의표현;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        int lt = 1, rt = 1, sum = 0;

        while (lt <= rt) {
            if (sum > n) sum -= lt++;
            else {
                if (sum == n) answer++;
                sum += rt++;
            }
            if (rt > n + 1) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(15));
    }

}
