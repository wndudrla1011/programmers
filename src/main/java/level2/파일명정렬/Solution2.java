package level2.파일명정렬;

import java.util.Arrays;
import java.util.regex.*;

public class Solution2 {

    public String[] solution(String[] files) {
        Pattern p = Pattern.compile("([a-z\\s.-]+)([0-9]{1,5})");

        Arrays.sort(files, (s1, s2) -> {
            Matcher m1 = p.matcher(s1.toLowerCase());
            Matcher m2 = p.matcher(s2.toLowerCase());
            m1.find();
            m2.find();

            if (!m1.group(1).equals(m2.group(1))) //HEAD 불일치
                return m1.group(1).compareTo(m2.group(1)); //HEAD 오름차순
            else //HEAD 일치
                return Integer.parseInt(m1.group(2)) - Integer.parseInt(m2.group(2)); //NUMBER 오름차순
        });

        return files;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new String[]{"F-5", "B-50", "A-10", "F-14"})));
    }

}
