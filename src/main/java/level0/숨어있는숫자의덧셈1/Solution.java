package level0.숨어있는숫자의덧셈1;

public class Solution {

    public int solution(String my_string) {
        return my_string.chars().filter(c -> (char) c >= 48 && c <= 57).map(c -> c - 48).sum();
//        return my_string.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1a2b3c4d123"));
    }

}
