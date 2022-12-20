package level0.한번만등장한문자;

import java.util.*;

public class Solution {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.split("");
        ArrayList<String> list = new ArrayList<>();

        for (String str : strArr) {
            if (Arrays.stream(strArr).filter(a -> a.equals(str)).count() == 1)
                list.add(str);
        }

        if (list.size() == 0) {
            return "";
        }

        list.sort(Comparator.naturalOrder());

        for (String str : list) {
            answer.append(str);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("dcba"));
    }

}
