package level0.p120894;

public class Solution2 {

    public long solution(String numbers) {
        String[] numbersArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbersArr.length; i++) {
            numbers = numbers.replaceAll(numbersArr[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("onetwothreefourfivesixseveneightnine"));
    }

}
