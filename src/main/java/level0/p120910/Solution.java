package level0.p120910;

public class Solution {

    public int solution(int n, int t) {
        return (int) (n * Math.pow(2, t));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(7, 15);
        System.out.println(result);
    }

}
