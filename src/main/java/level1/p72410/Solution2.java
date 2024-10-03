package level1.p72410;

public class Solution2 {

    public String solution(String new_id) {
        //1단계 : 대문자 -> 소문자
        String answer = new_id.toLowerCase();

        //2단계 : 영문/숫자/-/_/. 외 제거
        answer = answer.replaceAll("[^-_.a-z0-9]", "");

        //3단계 : 중복 "." 제거
        answer = answer.replaceAll("[.]{2,}", ".");

        //4단계 : 맨 앞 또는 맨 뒤의 "." 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        //5단계 : 빈 문자 대체
        if (answer.equals("")) answer += "a";

        //6단계 : 길이 16 이상 제거 (제거 후 맨 뒤의 "." 제거)
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        //7단계 : 길이 2 이하일 경우, 길이가 3이 될 때까지 마지막 문자 추가
        if (answer.length() <= 2) {
            while (answer.length() < 3)
                answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("abcdefghijklmn.p"));
    }

}
