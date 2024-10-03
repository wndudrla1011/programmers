package level1.p12948;

public class Solution {

    public String solution(String phone_number) {
        String[] p = phone_number.split("");

        for (int i = 0; i < p.length - 4; i++)
            p[i] = "*";

        return String.join("", p);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("01033334444"));
    }

}
