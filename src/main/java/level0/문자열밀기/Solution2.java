package level0.문자열밀기;

public class Solution2 {

    public int solution(String A, String B) {
        String tempB = B.repeat(2);
        return tempB.indexOf(A);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.solution("hello", "hello");
        System.out.println(result);
    }

}
