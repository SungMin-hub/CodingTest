import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i=0;i<my_string.length();i++){
            answer[i] = "";
            for(int j=i;j<my_string.length();j++)
                answer[i] += my_string.charAt(j);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}