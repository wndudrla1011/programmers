package level0.문자열정렬하기2;

public class Solution2 {

    public String solution(String my_string) {
        return my_string.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String result = s.solution("Bcad");
        System.out.println(result);
    }

}
