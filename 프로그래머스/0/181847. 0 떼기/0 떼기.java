class Solution {
    public String solution(String n_str) {
        String answer = "";
        int cnt = 0;
        int j=0;
        while(n_str.charAt(j) == '0'){
            cnt++;
            j++;
        }
        j = j == n_str.length() ? 0 : j;
        
        for(int i=j;i<n_str.length(); i++){
            answer += n_str.charAt(i);
        }
        
        return answer;
    }
}