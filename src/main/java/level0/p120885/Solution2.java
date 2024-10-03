package level0.p120885;

public class Solution2 {

    public String solution(String bin1, String bin2) {
        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("10", "11"));
    }

}
