import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        
        for(int i=0; i<100; i++){
            if(arr.length <= Math.pow(2,i)){
                size = (int)Math.pow(2,i);
                break;
            }
        }
        
        int[] answer = new int[size];
        
        for(int i=0; i<arr.length; i++) answer[i] = arr[i];
        for(int i=arr.length; i<answer.length; i++) answer[i] = 0;
        
        return answer;
    }
}