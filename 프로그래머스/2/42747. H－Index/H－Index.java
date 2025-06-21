import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int len = citations.length;
        
        Integer[] arr = new Integer[len];
        for(int i=0; i<len; i++) arr[i] = citations[i];
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int i=0; i<len; i++){
            if(arr[i] < i + 1) return i;
        }
        
        return arr.length;
    }
}