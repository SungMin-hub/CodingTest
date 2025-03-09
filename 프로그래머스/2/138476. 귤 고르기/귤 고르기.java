import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int max = 0;
        
        for(int i=0; i<tangerine.length; i++) max = Math.max(max,tangerine[i]);
        
        int[] arr = new int[max+1];
        
        for(int i=0; i<tangerine.length; i++) arr[tangerine[i]]++;
        
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--){
            k = k - arr[i];
            answer++;
            if(k <= 0 ) break;
        }
        
        
        return answer;
    }
}