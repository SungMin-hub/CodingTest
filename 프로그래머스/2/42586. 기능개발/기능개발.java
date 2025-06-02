import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        Queue<Integer> queueP = new LinkedList<>();
        Queue<Integer> queueS = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        
        for(int i=0; i<len; i++){
            queueP.offer(progresses[i]);
            queueS.offer(speeds[i]);
        }
        
        while(!queueP.isEmpty()){
            int size = queueP.size();
            for (int i = 0; i < size; i++) {
                int update = queueP.poll() + queueS.peek();
                queueP.offer(update);
                queueS.offer(queueS.poll());
            }
            
            int cnt = 0;
            while(!queueP.isEmpty() && queueP.peek() >= 100){
                queueP.poll();
                queueS.poll();
                cnt++;
            }
            if (cnt > 0) ans.offer(cnt);
        }
        
        int[] answer = new int[ans.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = ans.poll();
        }
        
        return answer;
    }
}