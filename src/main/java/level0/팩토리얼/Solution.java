package level0.팩토리얼;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            if (factorial(i) <= n)
                answer = i;
        }

        return answer;
    }

    private int factorial(int i) {
        if (i == 1) return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7));
    }

}
