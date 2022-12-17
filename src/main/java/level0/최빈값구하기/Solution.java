package level0.최빈값구하기;

public class Solution {

    public int solution(int[] array) {
        int maxIdx = Integer.MIN_VALUE;
        //최대 인덱스 값
        for (int v : array) {
            if (maxIdx < v)
                maxIdx = v;
        }

        int[] idxArr = new int[maxIdx + 1]; //인덱스 카운팅 배열
        int maxFrequency = 0;
        int result = 0;

        //빈도 카운팅
        for (int v : array) {
            idxArr[v]++;
        }

        //최빈값 구하기
        for (int i = 0;i < idxArr.length;i++) {
            if (maxFrequency < idxArr[i]) {
                maxFrequency = idxArr[i];
                result = i;
            }
        }

        //최빈값 중복
        int rep = 0;
        for (int i : idxArr) {
            if (maxFrequency == i)
                rep++;
        }

        if (rep != 1)
            return -1;

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 3, 3, 4}));
    }

}
