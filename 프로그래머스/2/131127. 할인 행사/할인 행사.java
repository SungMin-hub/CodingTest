import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<want.length; i++){
            map.put(want[i],number[i]);
        }
        
        for(int i=0; i<=discount.length-10; i++){
            Map<String, Integer> mapCopy = new HashMap<>(map);
            for(int j=0; j<10; j++){
                if(mapCopy.containsKey(discount[i+j]))
                    mapCopy.put(discount[i+j],mapCopy.get(discount[i+j])-1);
            }
            
            Boolean isRight = true;
            for(int val : mapCopy.values()){
                if(val != 0){
                    isRight = false;
                    break;
                }
            }
            
            if(isRight) answer++;
        }
        
        
        return answer;
    }
}