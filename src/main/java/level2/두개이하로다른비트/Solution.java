package level2.두개이하로다른비트;

import java.util.*;

public class Solution {

    static class Number {
        String type;
        Long num;

        public Number(String type, Long num) {
            this.type = type;
            this.num = num;
        }
    }

    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        List<Number> list = new ArrayList<>();

        for (long number : numbers) {
            String str = Long.toBinaryString(number);
            if (str.length() < 2) str = "0" + str;
            if (str.endsWith("11")) {
                int idx = str.length() - 1;
                while (idx >= 0 && str.charAt(idx) == '1') idx--;
                list.add(new Number(str.substring(idx + 1), number));
            }
            else list.add(new Number(str.substring(str.length() - 2), number));
        }

        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i).type) {
                case "00":
                case "01":
                case "10":
                    answer[i] = list.get(i).num + 1;
                    break;
                default:
                    answer[i] = (long) (list.get(i).num + Math.pow(2, list.get(i).type.length() - 1));
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new long[]{2, 3, 7})));
    }

}
