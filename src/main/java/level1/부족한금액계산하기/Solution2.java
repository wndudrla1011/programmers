package level1.부족한금액계산하기;

public class Solution2 {

    public long solution(int price, int money, int count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(3, 20, 4));
    }

}
