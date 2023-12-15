package level2.k진수에서소수개수구하기;

public class Solution2 {

    public int solution(int n, int k) {
        int answer = 0;

        String[] tmp = Integer.toString(n, k).split("0");

        Loop : for (String t : tmp) {
            if (t.length() == 0) continue; //2개 이상 연속된 0이 있을 경우
            long a = Long.parseLong(t);
            if (a == 1) continue;
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) continue Loop;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(437674, 3));
    }

}
