import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        
        if(cacheSize == 0) return cities.length * 5;
        
        for(int i=0; i<cities.length; i++){
            String city = cities[i].toUpperCase();
            if(q.contains(city)){
                answer++;
                q.remove(city);
                q.add(city);
            } else {
                answer += 5;
                if(q.size() >= cacheSize){
                    q.poll();
                }
                q.add(city);
            }
        }
        
        return answer;
    }
}