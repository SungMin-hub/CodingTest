class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        while(cnt < n){
            answer++;
            if(answer % 3 == 0 || Integer.toString(answer).contains("3")) continue;
            cnt++;
        }
        
        return answer;
    }
}