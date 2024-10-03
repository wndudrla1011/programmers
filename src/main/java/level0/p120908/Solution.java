package level0.p120908;

public class Solution {

    public int solution(String str1, String str2) {
        int answer = 0;

        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution("ppprrrogrammers", "pppp");
        System.out.println(result);
    }

}
