package level0.제곱수판별하기;

public class Solution {

    public int solution(int n) {
        int answer;
        int sqrt = (int) Math.sqrt(n);

        if (Math.pow(sqrt, 2) == n) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(976);
        System.out.println(result);
    }

}
