class Solution {
    public int[] solution(int n) {
        int idx = 0;
        int num = n;
        while (n != 1){
            idx++;
            if(n % 2 == 0) n /= 2;
            else n = 3*n+1;
        }
        
        int[] answer = new int[idx+1];
        
        idx = 0;
        while (num != 1){
            answer[idx++] = num;
            if(num % 2 == 0) num /= 2;
            else num = 3*num+1;
        }
        
        answer[idx] = num;
        
        return answer;
    }
}