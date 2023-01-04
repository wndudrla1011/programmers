package level1.가운데글자가져오기;

public class Solution2 {

    public String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("abcde"));
    }

}
