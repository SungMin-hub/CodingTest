import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stk.isEmpty() && stk.peek() == s.charAt(i)){
                stk.pop();
            } else {
                stk.push(s.charAt(i));                
            }
        }

        return stk.isEmpty() ? 1 : 0;
    }
}