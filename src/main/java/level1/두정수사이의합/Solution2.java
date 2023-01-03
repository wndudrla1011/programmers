package level1.두정수사이의합;

public class Solution2 {

    public long solution(int a, int b) {
        long f = Math.min(a, b), l = Math.max(a, b);
        return (l - f + 1) * (f + l) / 2;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(3, 5));
    }

}
