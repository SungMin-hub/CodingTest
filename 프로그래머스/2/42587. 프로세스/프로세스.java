import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int len = priorities.length;
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<len; i++){
            que.offer(i);
            pq.offer(priorities[i]);
        }
        
        while(!que.isEmpty()){
            int idx = que.poll();
            int val = priorities[idx];
            
            if(val == pq.peek()){
                answer++;
                pq.poll();
                if(idx == location) break;
            } else {
                que.offer(idx);
            }
        }
        
        return answer;        
    }
}