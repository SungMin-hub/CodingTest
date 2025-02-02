import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int i=0; i<arr.length; i++){
            if(stk.size() == 0) stk.push(arr[i]);
            else if(arr[i] == stk.peek()) stk.pop();
            else stk.push(arr[i]);
        }
        if(stk.size() == 0) return new int[] {-1};
        
        int[] answer = new int[stk.size()];
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = stk.pop();
        }
        
        return answer;
    }
}