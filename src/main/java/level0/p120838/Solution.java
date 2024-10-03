package level0.p120838;

import java.util.HashMap;

public class Solution {

    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();

        String[] morse = {".-:a","-...:b","-.-.:c","-..:d",".:e","..-.:f",
                "--.:g","....:h","..:i",".---:j","-.-:k",".-..:l", "--:m",
                "-.:n","---:o",".--.:p","--.-:q",".-.:r", "...:s","-:t",
                "..-:u","...-:v",".--:w","-..-:x", "-.--:y","--..:z"};

        for (String text : morse) {
            String key = "", value = "";
            for (String m : text.split(":")) {
                if (m.matches("^[a-z]")) {
                    value = m;
                } else {
                    key = m;
                }
            }
            map.put(key, value);
        }

        String[] morseLetter = letter.split(" ");
        for (String s : morseLetter) {
            answer.append(map.get(s));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String result = s.solution(".... . .-.. .-.. ---");
        System.out.println(result);
    }

}
