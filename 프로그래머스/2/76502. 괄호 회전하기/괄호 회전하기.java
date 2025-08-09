import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for(int i=0; i<len; i++){
            String str = s.substring(i) + s.substring(0,i);
            if(isSpin(str)) answer++;
        }
        
        return answer;
    }
    private boolean isSpin(String str){
        Stack<Character> stk = new Stack<>();
        for(char c: str.toCharArray()){
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
            } else {
                if (stk.isEmpty()) return false;
                char open = stk.pop();
                if (c == ')' && open != '(') return false;
                if (c == ']' && open != '[') return false;
                if (c == '}' && open != '{') return false;
            }
        }
        return stk.isEmpty();
    }
}