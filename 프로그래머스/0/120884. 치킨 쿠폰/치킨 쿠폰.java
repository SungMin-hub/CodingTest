class Solution {
    public int solution(int chicken) {
        int answer=0;
        
        // 100 -10 1
        // 91 - 10 2
        // 10 - 10 
        
        while(chicken >= 10) {
            chicken -= 10;
            chicken++;
            answer++;
        }
        
        return answer;
    }
}