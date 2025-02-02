import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        Arrays.fill(answer,"");

        int idx=0;
        for(int i=0; i<picture.length; i++){
            for(int m=0; m<k; m++){
                for(int j=0; j<picture[i].length(); j++){
                    for(int l=0; l<k; l++) answer[idx] += picture[i].charAt(j);  
                }
            idx++;
            }
        }
        
        return answer;
    }
}