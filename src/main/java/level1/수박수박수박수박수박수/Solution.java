package level1.수박수박수박수박수박수;

public class Solution {

    public String solution(int n) {
        String answer = "";
        boolean flag = true;

        while (n-- > 0) {
            answer += flag ? "수" : "박";
            flag = !flag;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

}
