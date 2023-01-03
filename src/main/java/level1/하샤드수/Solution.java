package level1.하샤드수;

public class Solution {

    public boolean solution(int x) {
        int temp = x, sum = 0;

        while (temp > 0) {
            sum += (temp % 10);
            temp /= 10;
        }

        return x % sum == 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

}
