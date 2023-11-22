package level2.숫자의표현;

public class Solution2 {

    public int solution(int n) {
        int answer = 1;
        int cnt = 1;

        n -= cnt;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(15));
    }

}
