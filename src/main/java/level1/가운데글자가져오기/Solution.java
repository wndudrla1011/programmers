package level1.가운데글자가져오기;

public class Solution {

    public String solution(String s) {
        String answer = "";
        int center = s.length() / 2;

        if (s.length() % 2 == 0)
            answer += s.substring(center - 1, center + 1);
        else
            answer += s.substring(center, center + 1);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcd"));
    }

}
