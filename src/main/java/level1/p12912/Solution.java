package level1.p12912;

public class Solution {

    public long solution(int a, int b) {
        long answer = 0;
        int start = 0, end = 0;

        if (a == b) {
            return a;
        } else if (a < b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        for (int i = start; i <= end; i++)
            answer += i;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 5));
    }

}
