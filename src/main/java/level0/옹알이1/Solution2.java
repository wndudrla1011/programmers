package level0.옹알이1;

public class Solution2 {

    public int solution(String[] babbling) {
        int answer = 0;
        String[] babyWord = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            for (String w : babyWord) {
                if (b.contains(w)) {
                    b = b.replaceAll(w, "-");
                }
            }
            b = b.replaceAll("-", "");
            if (b.length() == 0)
                answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String[] input = {"aya", "yee", "u", "maa", "wyeoo"};
        int result = s.solution(input);
        System.out.println(result);
    }

}