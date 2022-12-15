package level0.숫자찾기;

public class Solution2 {

    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.solution(232443, 4);
        System.out.println(result);
    }

}
