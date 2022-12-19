package level0.로그인성공;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public String solution(String[] id_pw, String[][] db) {
        return getDb(db).get(id_pw[0]) != null ? getDb(db).get(id_pw[0]).equals(id_pw[1]) ? "login" : "wrong pw" :"fail";
    }

    private Map<String, String> getDb(String[][] db) {
        Map<String, String> map = new HashMap<>();

        for (String[] array : db) {
            map.put(array[0], array[1]);
        }
        return map;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new String[]{"yyoom", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
    }

}
