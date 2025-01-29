import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        
        while(i<arr.length){
            if(stk.size() == 0){
                stk.push(arr[i]);
                i++;
            } else if (stk.peek() < arr[i]){
                stk.push(arr[i]);
                i++;
            } else {
                stk.pop();
            }
        }
        
        int[] answer = new int[stk.size()];
        for(int j=answer.length-1; j>=0; j--) answer[j] = stk.pop();
        
        return answer;
    }
}