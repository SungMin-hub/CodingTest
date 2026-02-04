import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i=0;i<array.length;i++){
            Arrays.sort(array);
            if(array[i] > height)
                answer++;
        }
        
        return answer;
    }
}