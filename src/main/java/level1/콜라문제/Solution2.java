package level1.콜라문제;

public class Solution2 {

    public int solution(int a, int b, int n) {
        return (n - b) / (a - b) * b;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(3, 2, 20));
    }

}
