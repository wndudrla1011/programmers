package level2.캐시_1차;

public class Solution {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cache = new String[cacheSize];

        if (cacheSize == 0) return cities.length * 5;

        for (String city : cities) {
            city = city.toUpperCase();
            int pos = cacheSize - 1;
            for (int j = 0; j < cacheSize; j++) {
                if (city.equals(cache[j])) { //Cache Hit
                    pos = j;
                    answer += 1;
                    break;
                }
                if (j == cacheSize - 1) { //Cache Miss
                    answer += 5;
                }
            }
            for (int j = pos; j > 0; j--) {
                cache[j] = cache[j - 1];
            }
            cache[0] = city;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
    }

}
