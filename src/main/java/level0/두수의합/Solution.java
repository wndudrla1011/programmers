package level0.두수의합;

public class Solution {
    public int solution(int num1, int num2) {
        return num1+num2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(2, 3);
        System.out.println("result = " + result);
    }
}
