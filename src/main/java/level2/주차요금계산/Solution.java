package level2.주차요금계산;

import java.util.*;

public class Solution {

    public List<Integer> solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        PriorityQueue<Parking> pq = new PriorityQueue<>();

        //우선순위 큐 <- 파싱
        for (String r : records) {
            String[] info = r.split(" ");
            String[] time = info[0].split(":");
            int minutes = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            pq.offer(new Parking(minutes, info[1], info[2]));
        }

        int in = 0; //입차 시간 기록
        int total_time = 0; //전체 주차 시간

        while (!pq.isEmpty()) {
            Parking pk = pq.poll();
            if (pq.isEmpty() || !pk.car_number.equals(pq.peek().car_number)) { //현재 차량 번호의 마지막 기록
                if (pk.status.equals("IN")) total_time += 1439 - pk.minutes; //출차 기록x
                else total_time += pk.minutes - in;
                //요금 계산
                int total_fees = (int) (fees[1] + Math.ceil((double) (total_time - fees[0]) / fees[2]) * fees[3]);
                answer.add(Math.max(total_fees, fees[1])); //기본 요금과 비교
                total_time = 0;
            } else { //마지막 기록x
                if (pk.status.equals("IN")) in = pk.minutes;
                else {
                    total_time += pk.minutes - in;
                    in = 0;
                }
            }
        }

        return answer;
    }

    static class Parking implements Comparable<Parking> {
        int minutes;
        String car_number;
        String status;

        public Parking(int minutes, String car_number, String status) {
            this.minutes = minutes;
            this.car_number = car_number;
            this.status = status;
        }

        @Override
        public int compareTo(Parking o) {
            if (this.car_number.equals(o.car_number)) return this.minutes - o.minutes; //같은 차량 시간순
            return Integer.parseInt(this.car_number) - Integer.parseInt(o.car_number); //차 번호 오름차순
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{120, 0, 60, 591}
                , new String[]{"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"}));
    }

}
