class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch != ' ') {
                for(int j=0; j<n; j++){
                    if(ch == 'z' || ch == 'Z') ch = (char)(ch-26);
                    ch = (char)(ch + 1);    
                }
            }
            answer += ch;
        }
        
        return answer;
    }
}