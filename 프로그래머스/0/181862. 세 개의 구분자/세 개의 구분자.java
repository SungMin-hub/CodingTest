import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] ans = myStr.split("a|b|c");
        
        List<String> list = new ArrayList<>();
        for(String i : ans) if(!(i.isEmpty())) list.add(i);
        
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        if(list.size() == 0) return new String[] {"EMPTY"};
        
        return answer;
    }
}