package level2.최솟값만들기;

public class Solution2 {

    public int solution(int []A, int []B) {
        int answer = 0;
        int len = A.length;

        quickSort(A, 0, A.length - 1);
        quickSort(B, 0, B.length - 1);

        for (int i = 0; i < len; i++) answer += A[i] * B[len - i - 1];

        return answer;
    }

    static void quickSort(int[] arr, int lt, int rt) {
        int i, j, pivot, tmp;

        if (lt < rt) {
            i = lt;
            j = rt;
            pivot = arr[lt];
            //분할
            while (i < j) {
                while (i < j && arr[j] > pivot) j--; //pivot 이하 찾기
                while (i < j && arr[i] <= pivot) i++; //pivot 보다 큰 값 찾기

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            //pivot <-> 멈춘 위치(분할 위치)
            arr[lt] = arr[i];
            arr[i] = pivot;
            //정렬
            quickSort(arr, lt, i - 1);
            quickSort(arr, i + 1, rt);
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }

}
