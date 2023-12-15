package level2.k진수에서소수개수구하기;

public class Solution {

    public int solution(int n, int k) {
        int answer = 0;

        String P = Integer.toString(n, k);

        int lt = 0, rt = 0;
        while (rt < P.length()) {
            while (rt < P.length() && P.charAt(rt) != '0') rt++;
            String num = P.substring(lt, rt); //0을 포함하지 않은 숫자
            if (isPrime(Long.parseLong(num))) answer++; //소수 확인
            while (rt < P.length() && P.charAt(rt) == '0') rt++;
            lt = rt;
        }

        return answer;
    }

    public boolean isPrime(long v) {
        if (v == 1) return false;
        for (int i = 2; i <= Math.sqrt(v); i++) {
            if (v % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(437674, 3));
    }

}
