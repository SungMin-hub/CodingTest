import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> c1Que = new LinkedList<>();
        Queue<String> c2Que = new LinkedList<>();
        
        for(int i=0; i<cards1.length; i++) c1Que.offer(cards1[i]);
        for(int i=0; i<cards2.length; i++) c2Que.offer(cards2[i]);
                
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(c1Que.peek())){
                c1Que.poll();
                continue;
            }
            if(goal[i].equals(c2Que.peek())){
                c2Que.poll();
                continue;
            }
            return "No";
        }
        
        return "Yes";
    }
}