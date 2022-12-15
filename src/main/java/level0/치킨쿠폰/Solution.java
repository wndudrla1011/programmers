package level0.치킨쿠폰;

public class Solution {

    public int solution(int chicken) {
        return chicken > 9 ? (chicken - 10) / 9 + 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(9));
    }

}
