package level0.p120837;

public class Solution {

    public int solution(int hp) {
        int answer = hp / 5;

        if (hp % 5 != 0) {
            hp %= 5;
            answer += hp / 3;
            if (hp % 3 != 0) {
                hp %= 3;
                answer += hp;
            } else {
                return answer;
            }
        } else {
            return answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(24));
    }

}
