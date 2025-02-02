import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        Character[] b_arr = new Character[before.length()];
        Character[] a_arr = new Character[after.length()];
        
        for(int i=0; i<before.length(); i++) b_arr[i] = before.charAt(i);
        for(int i=0; i<after.length(); i++) a_arr[i] = after.charAt(i);
        
        Arrays.sort(b_arr);
        Arrays.sort(a_arr);
        
        if(Arrays.equals(b_arr,a_arr)) return 1;
        
        return answer;
    }
}