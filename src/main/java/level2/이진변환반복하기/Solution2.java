package level2.이진변환반복하기;

public class Solution2 {

    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            int tmp = s.length();
            s = Integer.toBinaryString(tmp);
            answer[0]++;
            answer[1] -= tmp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("110010101001"));
    }

}
