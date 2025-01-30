import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> X = new Stack<>();
        
        for (int i=0; i<flag.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++) X.push(arr[i]);
            } else {
                for(int j=0; j<arr[i]; j++) X.pop();
            }
        }
        int[] answer = new int[X.size()];
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = X.pop();
        }
        
        return answer;
    }
}