package level1.p82612;

public class Solution3 {

    public long solution(int price, int money, int count) {
        for (int i = 0; i < count; i++) {
            money -= (price * (i + 1));
        }

        return money > 0 ? 0 : -money;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(3, 20, 4));
    }

}
