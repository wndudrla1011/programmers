package level0.p120895;

public class Solution {

    public String solution(String my_string, int num1, int num2) {
        String[] s = my_string.split("");

        String temp = s[num1];
        s[num1] = s[num2];
        s[num2] = temp;

        return String.join("", s);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", 1, 2));
    }

}
