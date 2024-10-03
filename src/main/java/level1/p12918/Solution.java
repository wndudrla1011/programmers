package level1.p12918;

public class Solution {

    public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() ==6))
            return false;

        return s.replaceAll("[0-9]", "").length() == 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1234A678"));
    }

}
