package level2.뉴스클러스터링_1차;

import java.util.*;

public class Solution {

    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> union = new ArrayList<>();
        List<String> intersection = new ArrayList<>();

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            String sub = str1.substring(i, i + 2);
            boolean flag = true;
            for (char c : sub.toCharArray()) {
                if (!(c >= 'A' && c <= 'Z')) {
                    flag = false;
                    break;
                }
            }
            if (flag) list1.add(sub);
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String sub = str2.substring(i, i + 2);
            boolean flag = true;
            for (char c : sub.toCharArray()) {
                if (!(c >= 'A' && c <= 'Z')) {
                    flag = false;
                    break;
                }
            }
            if (flag) list2.add(sub);
        }

        Collections.sort(list1);
        Collections.sort(list2);

        //자카드 유사도
        for (String s : list1) {
            if (list2.remove(s)) intersection.add(s);
            union.add(s);
        }

        union.addAll(list2);

        double jakard = 0;

        if (union.size() == 0) jakard = 1;
        else jakard = (double) intersection.size() / (double) union.size();

        return (int) (jakard * 65536);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aa1+aa2", "AAAA12"));
    }

}
