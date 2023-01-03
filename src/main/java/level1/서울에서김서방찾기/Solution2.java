package level1.서울에서김서방찾기;

import java.util.Arrays;

public class Solution2 {

    public String solution(String[] seoul) {
        int idx = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + idx + "에 있다";
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new String[]{"Jane", "Kim"}));
    }

}
