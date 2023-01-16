package level1.개인정보수집유효기간;

import java.text.*;
import java.util.*;

public class Solution {

    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = new int[privacies.length];
        Map<String, Integer> clause = new HashMap<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date dateToday = sdf.parse(today);

        for (String t : terms) {
            String[] s = t.split(" ");
            clause.put(s[0], Integer.parseInt(s[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] s = privacies[i].split(" ");
            int privacy = clause.get(s[1]);
            String[] d = s[0].split("[.]");
            String valid = calculator(privacy, Integer.parseInt(d[2]), Integer.parseInt(d[1]), Integer.parseInt(d[0]));
            Date validDate = sdf.parse(valid);
            if (dateToday.compareTo(validDate) > 0)
                answer[i] = i + 1;
        }

        return Arrays.stream(answer).filter(i -> i != 0).toArray();
    }

    private String calculator(int privacy, int date, int month, int year) {
        if (date == 1) {
            date = 28;
            month -= 1;
        }
        else date -= 1;
        year += (month + privacy) / 12;
        month = (month + privacy) % 12;
        return year + "." + month + "." + date;
    }

    public static void main(String[] args) throws ParseException {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"},
                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
    }

}
