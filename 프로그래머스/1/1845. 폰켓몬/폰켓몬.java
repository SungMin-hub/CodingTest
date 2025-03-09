import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t: nums){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        
        for(int n: map.keySet()){
            answer++;
            if(answer == (int)(nums.length / 2)) break;
        }
        
        
        return answer;
    }
}