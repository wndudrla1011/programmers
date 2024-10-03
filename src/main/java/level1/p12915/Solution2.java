package level1.p12915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {

    public String[] solution(String[] s, int n) {
        String[] answer = {};
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            arr.add("" + s[i].charAt(n) + s[i]);
        }

        Collections.sort(arr);

        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new String[]{"bbc", "dba", "abcd", "ceo"}, 2)));
    }

}
