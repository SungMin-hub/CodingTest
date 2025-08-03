import java.util.*;

class Solution {
    public Integer[] solution(int[] numlist, int n) {
        int len = numlist.length;
        Integer[] answer = new Integer[len];
        
        for(int i=0; i<len; i++) answer[i] = numlist[i];
        
        Arrays.sort(answer,(a,b) -> {
            int num1 = Math.abs(a - n);
            int num2 = Math.abs(b - n);
            
            if(num1 == num2) return b-a;
            return num1 - num2;
        });

        return answer;
    }
}