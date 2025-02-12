class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0; i<=t.length()-p.length(); i++){
            String str = "";
            for(int j=i; j<p.length()+i; j++) str += t.charAt(j);
            if(Long.parseLong(str) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}