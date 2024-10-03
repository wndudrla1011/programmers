package level1.p12912;

public class Solution3 {

    public long solution(int a, int b) {
        long answer = 0;

        for (int i = (Math.min(a, b)); i <= (Math.max(a, b)); i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(3, 5));
    }

}
