package level2.구명보트;

import java.util.Arrays;

public class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0, min = 0;

        Arrays.sort(people);

        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) min++; //최소 몸무게 => 보트
            answer++; //최대 몸무게 => 보트
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{70, 50, 80, 50}, 100));
    }

}
