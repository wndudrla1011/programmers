package level1.숫자짝꿍;

public class Solution {

    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] arrX = new int[10];
        int[] arrY = new int[10];

        checkNumInArr(X, arrX);
        checkNumInArr(Y, arrY);

        for (int i = arrX.length - 1; i >= 0; i--) {
            while (arrX[i] >= 1 && arrY[i] >= 1) {
                arrX[i]--;
                arrY[i]--;
                answer.append(i);
            }
        }

        if (answer.toString().equals("")) return "-1";
        if (answer.toString().startsWith("0")) return "0";

        return answer.toString();
    }

    private void checkNumInArr(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - '0';
            arr[index]++;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("100", "2345"));
    }

}
