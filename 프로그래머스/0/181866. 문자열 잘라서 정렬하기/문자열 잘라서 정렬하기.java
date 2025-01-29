import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List <String> list = new ArrayList<>();
        
        for (String i : arr) if(!(i.equals(""))) list.add(i);
        
    
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}