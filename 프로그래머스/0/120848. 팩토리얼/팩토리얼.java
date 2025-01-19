class Solution {
    public int solution(int n) {
        int answer = 0;
        int fec = 1;
        int num = 1;
        while(n >= fec){
            num++;
            fec *= num;
        }
        
        return answer= num-1;
    }
}