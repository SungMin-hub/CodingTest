class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx=0;
        for(int i=0; i<num_list.length; i+=n) idx++;
        
        int[] answer = new int[idx];
        
        idx = 0;
        for(int i=0; i<num_list.length; i+=n) answer[idx++] = num_list[i];
        
        return answer;
    }
}