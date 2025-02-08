import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n+"";
        int[] arr = new int[str.length()];
        
        for(int i=0; i<str.length(); i++) arr[i] = str.charAt(i) - '0';
        
        Arrays.sort(arr);
        str = "";
        for (int i=arr.length-1; i>=0; i--) str += arr[i];
        
        return answer = Long.parseLong(str);
    }
}