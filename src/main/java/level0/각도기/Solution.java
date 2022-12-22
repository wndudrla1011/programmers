package level0.각도기;

public class Solution {

    public int solution(int angle) {
        int answer;

        if (angle > 0 && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(70));
    }

}
