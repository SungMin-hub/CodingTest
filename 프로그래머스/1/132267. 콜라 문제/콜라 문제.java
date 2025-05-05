class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int num = (n / a) * b; 
            answer += num;
            n = (n % a) + num;     
        }
        
        return answer;
    }
}