package level0.p120892;

public class Solution2 {

    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i += code) {
            answer += cipher.substring(i - 1, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("pfqallllabwaoclk", 2));
    }

}
