package level0.p120912;

public class Solution {

    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            while (array[i] / 10 != 0) {
                if (array[i] % 10 == 7) {
                    answer++;
                }
                array[i] = array[i] / 10;
            }
            if (array[i] == 7) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(new int[]{7, 77, 17});
        System.out.println(result);
    }

}