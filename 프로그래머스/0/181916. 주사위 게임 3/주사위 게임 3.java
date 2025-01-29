import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a,b,c,d};
        
        Arrays.sort(arr);
        
        if(arr[0] == arr[3]) answer = arr[0] * 1111;
        
        else if(arr[0] == arr[2] || arr[1] == arr[3]){
            int p = arr[2];
            int q = arr[0] == arr[1] ? arr[3] : arr[0];
            answer = (10*p+q) * (10*p+q);
        }
        else if(arr[0] == arr[1] && arr[2] == arr[3]){
            int p = arr[0];
            int q = arr[2];
            answer = p-q > 0 ? (p+q) * (p-q) : (p+q) * (q-p);
        }
        else if(arr[0] == arr[1]) answer = arr[2] * arr[3];
        else if(arr[1] == arr[2]) answer = arr[0] * arr[3];
        else if(arr[2] == arr[3]) answer = arr[0] * arr[1];
        else answer = arr[0];
        
        
        return answer;
    }
}