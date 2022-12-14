package level0.컨트롤제트;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        String[] z = s.split(" ");

        for (int i = 0; i < z.length; i++) {
            int num = !z[i].equals("Z") ? Integer.parseInt(z[i]) : -Integer.parseInt(z[i - 1]);
            answer += num;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution("10 Z 20 Z");
        System.out.println(result);
    }

}
