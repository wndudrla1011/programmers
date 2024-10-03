package level0.p120910;

public class Solution2 {

    public int solution(int n, int t) {
        return n << t;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.solution(7, 15);
        System.out.println(result);
    }

}
