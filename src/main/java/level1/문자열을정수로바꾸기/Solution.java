package level1.문자열을정수로바꾸기;

public class Solution {

    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("-1234"));
    }

}
