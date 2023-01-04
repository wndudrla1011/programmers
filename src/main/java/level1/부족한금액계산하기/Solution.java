package level1.부족한금액계산하기;

public class Solution {

    public long solution(int price, int money, int count) {
        long usage = (count * (2L * price + (long) (count - 1) * price)) / 2;

        return money < usage ? usage - money : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 20, 4));
    }

}
