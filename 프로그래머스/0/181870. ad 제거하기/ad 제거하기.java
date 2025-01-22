class Solution {
    public String[] solution(String[] strArr) {
        int idx=0;
        for(int i=0; i<strArr.length; i++)
            if(strArr[i].contains("ad") != true)    idx++;
        String[] answer = new String[idx];
        
        idx =0;
        for(int i=0; i<strArr.length; i++)
            if(strArr[i].contains("ad") != true)    answer[idx++] = strArr[i];
        
        return answer;
    }
}