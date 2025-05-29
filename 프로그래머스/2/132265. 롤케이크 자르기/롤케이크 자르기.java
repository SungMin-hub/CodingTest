import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int len = topping.length;
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<len; i++){
            map.put(topping[i],map.getOrDefault(topping[i],0)+1);
        }
        
        for(int i=len-1; i>=0; i--){
            set.add(topping[i]);
            map.put(topping[i],map.get(topping[i])-1);
            if(map.get(topping[i]) == 0) map.remove(topping[i]);
            if(set.size() == map.size()) answer++;
        }
        
        return answer;
    }
}