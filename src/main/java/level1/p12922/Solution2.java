package level1.p12922;

public class Solution2 {

    public String solution(int n) {
        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(10));
    }

}
