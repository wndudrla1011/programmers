package level1.p12943;

public class Solution {

    public int solution(int num) {
        long n = num;
        int answer = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            answer++;

            if (answer > 500) {
                return -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1));
    }

}
