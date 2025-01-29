import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)(Math.ceil((double)my_str.length() / n))];
        
        for(int i=0; i<answer.length; i++) answer[i] = "";
        
        int idx = 0;
        for(int i=0; i<my_str.length(); i++){
            answer[idx] += my_str.charAt(i);
            if(answer[idx].length() == n) idx++;
        }
        
        return answer;
    }
}