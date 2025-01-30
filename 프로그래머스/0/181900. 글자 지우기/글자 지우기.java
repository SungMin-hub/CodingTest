import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = new String[my_string.length()];
        for(int i=0; i<arr.length; i++) arr[i] = "";
        
        for(int i=0; i<my_string.length(); i++) arr[i] += my_string.charAt(i);
        
        for(int i : indices) arr[i] = "";
        
        for(int i=0; i<my_string.length(); i++) answer += arr[i];
        
        return answer;
    }
}