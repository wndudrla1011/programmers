package level1.서울에서김서방찾기;

import java.util.stream.IntStream;

public class Solution {

    public String solution(String[] seoul) {
        int idx = IntStream.range(0, seoul.length).filter(i -> seoul[i].equals("Kim")).findFirst().orElse(-1);
        return "김서방은 " + idx + "에 있다";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"Jane", "Kim"}));
    }

}
