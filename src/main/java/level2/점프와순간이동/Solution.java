package level2.점프와순간이동;

public class Solution {

    public int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 0) n /= 2;
            else {
                n--;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5000));
    }

}
