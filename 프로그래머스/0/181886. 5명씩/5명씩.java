class Solution {
    public String[] solution(String[] names) {
        int idx = 0;
        for(int i=0; i<names.length; i+=5) idx++;
        String[] answer = new String[idx];
        
        idx = 0;
        for(int i=0; i<names.length; i+=5) answer[idx++] = names[i];
        
        return answer;
    }
}