package level2.이진변환반복하기;

public class Solution {

    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            StringBuilder tmp = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == 48) answer[1]++;
                else tmp.append(c);
            }
            s = Integer.toBinaryString(tmp.length());
            answer[0]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("110010101001"));
    }

}
