import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] cp_arr = Arrays.copyOf(arr,arr.length);
        if(arr.length == 1) return new int[]{-1};
        
        Arrays.sort(arr);
        int min = arr[0];
        
        int idx = 0;
        for(int i=0; i<cp_arr.length; i++) if(cp_arr[i] != min) answer[idx++] = cp_arr[i];
        
        
        return answer;
    }
}