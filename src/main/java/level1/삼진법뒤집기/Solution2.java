package level1.삼진법뒤집기;

public class Solution2 {

    public int solution(int n) {
        String a = "";

        while (n > 0) {
            a = (n % 3) + a;
            n /= 3;
        }

        a = new StringBuilder(a).reverse().toString();

        return Integer.parseInt(a, 3);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(125));
    }

}
