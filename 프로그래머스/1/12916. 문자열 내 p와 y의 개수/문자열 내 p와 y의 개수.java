class Solution {
    boolean solution(String s) {
        int p_cnt = 0;
        int y_cnt = 0;
        s=s.toLowerCase();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p') p_cnt++;
            else if(s.charAt(i) == 'y') y_cnt++;
        }
        return p_cnt == y_cnt ? true : false;
    }
}