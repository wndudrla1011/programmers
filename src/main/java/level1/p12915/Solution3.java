package level1.p12915;

import java.util.*;

public class Solution3 {

    public String[] solution(String[] s, int n) {
        Arrays.sort(s, (o1, o2) -> {
            if (o1.charAt(n) > o2.charAt(n)) return 1; //keep
            else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo (o2); //compare to
            else if (o1.charAt(n) < o2.charAt(n)) return -1; //reverse
            else return 0; //charAt(n) == null
        });

        return s;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(Arrays.toString(s.solution(new String[]{"bbc", "dba", "abcd", "ceo"}, 2)));
    }

}
