package level0.로그인성공;

public class Solution {

    public String solution(String[] id_pw, String[][] db) {
        for (String[] account : db) {
            if (id_pw[0].equals(account[0])) {
                if (id_pw[1].equals(account[1])) {
                    return "login";
                }
                return "wrong pw";
            }
        }
        return "fail";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"yyoom", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
    }

}
