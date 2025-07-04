import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue <Integer> que = new LinkedList<>();
        Queue<int[]> bridgeTruck = new LinkedList<>();
        
        int sum = 0;
        
        for(int i : truck_weights) que.offer(i);
        
        while(!que.isEmpty() || !bridgeTruck.isEmpty()){
            answer++;
            
            if(!bridgeTruck.isEmpty()){
                int[] truck = bridgeTruck.peek();
                if(answer - truck[1] >= bridge_length) {
                    sum -= truck[0];
                    bridgeTruck.poll();
                }
            }
            
            if(!que.isEmpty() && sum + que.peek() <= weight){
                int curTruck = que.poll();
                bridgeTruck.offer(new int[]{curTruck,answer});
                sum += curTruck;
            }
        }
        
        return answer;
    }
}