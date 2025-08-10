class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);
        int[] answer = new int[len];
        
        for(long i=left; i<=right; i++){
            long a = i / n;
            long b = i % n;
            answer[(int)(i-left)] = (int)Math.max(a,b) + 1;
        }
        
        return answer;
    }
}