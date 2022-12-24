package level0.두수의나눗셈;

public class Solution {

    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2;
        return (int) (answer * 1000);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7, 3));
    }

}
