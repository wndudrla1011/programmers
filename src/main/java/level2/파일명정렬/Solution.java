package level2.파일명정렬;

import java.util.Arrays;

public class Solution {

    static class File {
        String HEAD;
        String NUMBER;
        String TAIL;

        public File(String HEAD, String NUMBER, String TAIL) {
            this.HEAD = HEAD;
            this.NUMBER = NUMBER;
            this.TAIL = TAIL;
        }
    }

    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        File[] files_info = new File[files.length];

        for (int k = 0; k < files.length; k++) {
            String HEAD = "", TAIL = "", NUMBER = "";
            int i, j;
            for (i = 0; i < files[k].length(); i++) {
                if (Character.isDigit(files[k].charAt(i))) {
                    HEAD = files[k].substring(0, i);
                    break;
                }
            }
            for (j = i; j < files[k].length(); j++) {
                if (!Character.isDigit(files[k].charAt(j))) {
                    NUMBER = files[k].substring(i, j);
                    break;
                }
            }
            if (NUMBER.equals("")) NUMBER = files[k].substring(i);
            TAIL = files[k].substring(j);
            files_info[k] = new File(HEAD, NUMBER, TAIL);
        }

        Arrays.sort(files_info, (o1, o2) -> {
            if (o1.HEAD.equalsIgnoreCase(o2.HEAD)) //HEAD 동일
                return Integer.parseInt(o1.NUMBER) - Integer.parseInt(o2.NUMBER); //NUMBER 오름차순
            return o1.HEAD.compareToIgnoreCase(o2.HEAD); //HEAD 오름차순
        });

        for (int i = 0; i < files.length; i++) {
            answer[i] = files_info[i].HEAD + files_info[i].NUMBER + files_info[i].TAIL;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"F-5", "B-50", "A-10", "F-14"})));
    }

}
