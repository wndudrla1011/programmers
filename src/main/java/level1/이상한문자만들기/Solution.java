package level1.이상한문자만들기;

public class Solution {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        for (String word : words) {
            boolean flag = true;
            for (String c : word.split("")) {
                if (flag) {
                    answer.append(c.toUpperCase());
                } else {
                    answer.append(c.toLowerCase());
                }
                flag = !flag;
            }
            answer.append(" ");
        }

        return answer.substring(0, answer.length() - 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(" try hahaha world "));
    }

}
