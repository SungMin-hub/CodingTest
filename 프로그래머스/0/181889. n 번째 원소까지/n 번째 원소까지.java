class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        for(int i=0; i<n; i++) idx++;
        
        int[] answer = new int[idx];
        
        idx = 0;
        for(int i=0; i<n; i++) answer[idx++] = num_list[i];
        
        return answer;
    }
}