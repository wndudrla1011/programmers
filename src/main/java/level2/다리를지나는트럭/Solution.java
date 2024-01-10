package level2.다리를지나는트럭;

import java.util.*;

public class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0; //현재 다리에 올라간 트럭 무게
        int time = 0; //총 걸린 시간
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];

            while (true) {
                if (q.isEmpty()) { //다리가 빈 상태
                    q.offer(truck);
                    sum += truck;
                    time++;
                    break;
                } else if (q.size() == bridge_length) { //다리에 트럭이 가득 찬 상태
                    sum -= q.poll();
                } else { //다리 일부에 트럭이 있는 상태
                    if (sum + truck <= weight) { //추가 입장 가능
                        q.offer(truck);
                        sum += truck;
                        time++;
                        break;
                    } else { //추가 입장 불가능
                        q.offer(0); //dummy -> 트럭을 앞으로 밀어냄
                        time++;
                    }
                }
            }
        }

        return time + bridge_length; //마지막 트럭이 나갈 때까지
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 10, new int[]{7, 4, 5, 6}));
    }

}
