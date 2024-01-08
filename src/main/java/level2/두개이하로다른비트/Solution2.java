package level2.두개이하로다른비트;

import java.util.Arrays;

public class Solution2 {

    public long[] solution(long[] numbers) {
        long[] answer = numbers.clone();
        for(int i = 0; i< answer.length; i++){
            answer[i]++;
            answer[i] += (answer[i] ^ numbers[i]) >>> 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new long[]{15, 16, 17})));
    }

}
