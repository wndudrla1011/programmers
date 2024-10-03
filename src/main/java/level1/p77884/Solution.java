package level1.p77884;

public class Solution {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer += i * (Math.pow((int) Math.sqrt(i), 2) == i ? -1 : 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(13, 17));
    }

}
