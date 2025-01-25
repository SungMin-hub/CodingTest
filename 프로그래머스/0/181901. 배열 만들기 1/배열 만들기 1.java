class Solution {
    public int[] solution(int n, int k) {
        int idx =0;
        for (int i=k; i<=n; i +=k) idx++;
        
        int[] answer = new int[idx];
        
        idx = 0;
        for (int i=k; i<=n; i +=k) answer[idx++] = i; 
         
        return answer;
    }
}