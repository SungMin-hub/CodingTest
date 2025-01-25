class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int idx =0;
        for (int i=0; i<finished.length; i++) {
            if(finished[i] == false) idx++;
        }
            
        String[] answer = new String[idx];
        
        idx = 0;
        for (int i=0; i<todo_list.length; i++){
            if(finished[i] == false) answer[idx++] = todo_list[i];
        }
        
        return answer;
    }
}