package level0.p120818;

public class Solution {

    public int solution(int price) {
        return (int) (price >= 500000 ? price * 0.8 : price >= 300000 ? price * 0.9 : price >= 100000 ? price * 0.95 : price);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(90000));
    }

}
