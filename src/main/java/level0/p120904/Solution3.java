package level0.p120904;

public class Solution3 {

    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int result = s.solution(232443, 4);
        System.out.println(result);
    }

}
