package level2.n진수게임;

public class Solution {

    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder str = new StringBuilder();

        for (int i = 0; str.length() <= t * m; i++) {
            str.append(Integer.toString(i, n));
        }

        for (int i = p - 1; answer.length() < t; i += m) {
            answer.append(str.charAt(i));
        }

        return answer.toString().toUpperCase();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 4, 2, 1));
    }

}
