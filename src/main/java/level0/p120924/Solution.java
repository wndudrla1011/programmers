package level0.p120924;

public class Solution {

    public int solution(int[] common) {
        int answer = 0;

        if ((common[2] - common[1]) == (common[1] - common[0])) {
            System.out.println("등차수열");
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            System.out.println("등비수열");
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution theNextNumber = new Solution();
        int result = theNextNumber.solution(new int[]{5, 20, 80, 320});
        System.out.println(result);
    }

}
