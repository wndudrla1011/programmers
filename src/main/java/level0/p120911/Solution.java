package level0.p120911;

import java.util.Arrays;

public class Solution {

    public String solution(String my_string) {
        String answer = "";

        my_string = my_string.toLowerCase();
        char[] chars = my_string.toCharArray();

        Arrays.sort(chars);
        answer = new String(chars);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String result = s.solution("Bcad");
        System.out.println(result);
    }

}
