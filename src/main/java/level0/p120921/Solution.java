package level0.p120921;

import java.util.ArrayList;

public class Solution {

    @SuppressWarnings("unchecked")
    public int solution(String A, String B) {
        int answer;

        StringBuilder temp = new StringBuilder();
        ArrayList modified = new ArrayList(A.length() - 1);

        if (A.equals(B)) {
            answer = 0;
            return answer;
        }

        for (int i = A.length() - 1; i >= 1; i--) {
            temp.append(A.subSequence(i, A.length())).append(A.subSequence(0, i));
            modified.add(temp.toString());
            temp = new StringBuilder();
        }

        if (modified.contains(B)) {
            answer = modified.indexOf(B) + 1;
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution("hello", "hello");
        System.out.println(result);
    }

}
