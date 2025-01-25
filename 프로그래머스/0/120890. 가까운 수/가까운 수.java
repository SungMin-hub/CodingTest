import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 100;
        int num = 0;
        Arrays.sort(array);
        
        for (int i=0; i<array.length; i++){
            num = n- array[i];
            if(num < 0) num *= (-1);
            if(num < diff) {
                diff = num;
                answer = array[i];
            }
        }
      
        return answer;
    }
}