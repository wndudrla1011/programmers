package level0.피자나눠먹기1;

public class Solution {

    public int solution(int n) {
        return n / 7 + (n % 7 > 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(22));
    }

}
