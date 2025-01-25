class Solution {
    public String solution(String my_string) {
        String answer = ""+my_string.charAt(0);
        
        for(int i=1; i<my_string.length(); i++){
            boolean num = false;
            
            for(int j=0; j<answer.length(); j++){
                if(my_string.charAt(i) == answer.charAt(j)) {
                    num = true;
                    break;
                }
            }
            if(!num)    answer += my_string.charAt(i);
        }
        
        return answer;
    }
}