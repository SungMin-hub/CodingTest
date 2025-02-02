import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int maxSize = Math.max(arr.length,arr[0].length);
        int[][] answer = new int[maxSize][maxSize];
        
        for (int i=0; i<arr.length; i++){
            answer[i] = Arrays.copyOf(arr[i],maxSize);
        }
        
        return answer;
    }
}