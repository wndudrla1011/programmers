package level1.문자열나누기;

public class Solution {

    public int solution(String s) {
        int answer = 0;

        while (s.length() > 0) {
            String[] str = s.split("");
            String x = str[0];
            int xCnt = 1, another = 0, i;
            for (i = 1; i < str.length; i++) {
                if (str[i].equals(x)) xCnt++;
                else another++;
                if (another == xCnt) {
                    answer++;
                    s = s.substring(i + 1);
                    break;
                }
            }
            if (another != xCnt) {
                answer++;
                s = s.substring(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abracadabra"));
    }

}
