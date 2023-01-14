package level1.문자열나누기;

public class Solution2 {

    public int solution(String s) {
        char prev = '1';
        int answer = 0, same = 0, different = 0;

        for (char c : s.toCharArray()) {
            if (prev == '1') {
                prev = c;
                same++;
                answer++;
            } else if (prev == c) {
                same++;
            } else {
                different++;
            }
            if (same == different) {
                prev = '1';
                same = 0; different = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("abracadabra"));
    }

}
