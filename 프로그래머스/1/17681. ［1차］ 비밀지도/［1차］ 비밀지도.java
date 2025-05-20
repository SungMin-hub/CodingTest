import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            answer[i] = "";
            for(int j=0, p=n-1; j<n; j++, p--){
                int po = (int)Math.pow(2,p);
                if(arr1[i] >= po){
                    arr1[i] -= po;
                    arr[i][j] = 1;
                }
                if(arr2[i] >= po){
                    arr2[i] -= po;
                    arr[i][j] = 1;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1) answer[i] += "#";
                else answer[i] += " ";
            }
        }
        
        return answer;
    }
}