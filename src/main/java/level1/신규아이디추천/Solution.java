package level1.신규아이디추천;

public class Solution {

    public String solution(String new_id) {
        //1단계 : 대문자 -> 소문자
        new_id = new_id.toLowerCase();

        //2단계 : 영문/숫자/-/_/. 외 제거
        for (String s : new_id.split("")) {
            if (!s.matches("\\w") && !s.equals(".") && !s.equals("-") && !s.equals("_"))
                new_id = new_id.replace(s, "");
        }

        //3단계 : 중복 "." 제거
        String[] str = new_id.split("");
        for (int i = 0; i < str.length; i++) {
            if (i > 0 && str[i].equals(".")) {
                if (str[i - 1].equals(".")) {
                    str[i - 1] = "";
                }
            }
        }

        new_id = String.join("", str);

        //4단계 : 맨 앞 또는 맨 뒤의 "." 제거
        if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);
        if (new_id.indexOf(".") == 0) new_id = new_id.substring(1);

        //5단계 : 빈 문자 대체
        if (new_id.equals("")) new_id = "a";

        //6단계 : 길이 16 이상 제거 (제거 후 맨 뒤의 "." 제거)
        if (new_id.length() > 15) new_id = new_id.substring(0, 15);
        if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);

        //7단계 : 길이 2 이하일 경우, 길이가 3이 될 때까지 마지막 문자 추가
        if (new_id.length() <= 2) {
            String lastChar = new_id.substring(new_id.length() - 1);
            while (new_id.length() != 3)
                new_id += lastChar;
        }

        return new_id;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcdefghijklmn.p"));
    }

}
