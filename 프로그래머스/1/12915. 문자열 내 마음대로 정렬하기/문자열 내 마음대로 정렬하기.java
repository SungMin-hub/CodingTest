import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = new String[len];
        Arrays.sort(strings);
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        
        for(int i='a'; i<='z'; i++){
            for(int j=0; j<len; j++){
                if(strings[j].charAt(n) == i) answer[idx++] = strings[j];
            }
        }
        
        
        
        
        return answer;
    }
}