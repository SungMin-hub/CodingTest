import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        
        for (int i=0; i<s.length(); i++){
            int cnt = 0;
            for (int j=0; j<s.length(); j++){
                if (s.charAt(i) == s.charAt(j)) cnt++;
            }
            if (cnt == 1) answer += s.charAt(i);
        }
        
        char[] arr = new char[answer.length()];
        for (int i=0; i<answer.length(); i++) arr[i] = answer.charAt(i);
        Arrays.sort(arr);
        answer = "";
        for (int i=0; i<arr.length; i++) answer += arr[i];
        
        return answer;
    }
}