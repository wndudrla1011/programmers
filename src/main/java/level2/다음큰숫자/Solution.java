package level2.다음큰숫자;

public class Solution {

    public int solution(int n) {
        int len = count_one(n); //n의 "1" 의 개수

        while (true) {
            n += 1;
            int next = count_one(n);
            if (next == len) break;
        }

        return n;
    }

    static int count_one(int v) {
        int cnt = 0;
        while (v > 0) {
            if (v % 2 > 0) cnt++;
            v /= 2;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(78));
    }

}
