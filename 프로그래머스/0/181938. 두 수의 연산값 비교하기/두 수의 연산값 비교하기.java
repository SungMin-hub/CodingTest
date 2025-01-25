class Solution {
    public int solution(int a, int b) {
        String answer = ""+a+b;
        
        if(Integer.parseInt(answer) < 2*a*b) return 2*a*b;
        
        return Integer.parseInt(answer);
    }
}