package level1.p12977;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int cnt = 0;
                    for (int l = 1; l <= sum; l++) {
                        if (sum % l == 0) cnt++;
                    }
                    if (cnt == 2) answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 7, 6, 4}));
    }

}
