package level1.p14735;

public class Solution {

    public int solution(String t, String p) {
        int answer = 0;
        long num = Long.parseLong(p);
        int len = p.length();

        for (int i = 0; i <= t.length() - len; i++) {
            long diff = Long.parseLong(t.substring(i, i + len));
            if (diff <= num) answer ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("10203", "15"));
    }

}
