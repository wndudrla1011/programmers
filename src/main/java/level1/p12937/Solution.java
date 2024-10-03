package level1.p12937;

public class Solution {

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3));
    }

}
