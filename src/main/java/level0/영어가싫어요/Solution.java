package level0.영어가싫어요;

import java.util.Arrays;

class Solution {
    public long solution(String numbers) {
        long answer = 0;

        numbers = numbers.replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");

        long[] numArr = Arrays.stream(numbers.split(""))
                .mapToLong(Long::parseLong)
                .toArray();

        int index = numArr.length;
        for (long n : numArr) {
            answer += n * Math.pow(10, index - 1);
            index--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("onetwothreefourfivesixseveneightnine"));
    }

}
