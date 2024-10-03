package level0.p120830;

public class Solution {

    public int solution(int n, int k) {
        return 12000 * n + 2000 * (k - n / 10);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10, 3));
    }

}
