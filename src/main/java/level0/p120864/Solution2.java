package level0.p120864;

public class Solution2 {

    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String s : str) {
            if (!s.equals(""))
                answer += Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("11111"));
    }

}
