package level0.p120807;

public class Solution {

    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 3));
    }

}
