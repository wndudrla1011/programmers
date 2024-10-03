package level1.p12934;

public class Solution3 {

    public long solution(long n) {
        double i = Math.sqrt(n);

        return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(1));
    }

}
