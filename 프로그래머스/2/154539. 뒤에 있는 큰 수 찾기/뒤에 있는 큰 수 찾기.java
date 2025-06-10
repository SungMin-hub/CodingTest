import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Stack<Integer> stk = new Stack<>();
        
        for (int i=0; i<len; i++) {
            while (!stk.isEmpty() && numbers[stk.peek()] < numbers[i]) {
                answer[stk.pop()] = numbers[i];
            }
            stk.push(i);
        }
        
        while (!stk.isEmpty()) {
            answer[stk.pop()] = -1;
        }

        return answer;
    }
}