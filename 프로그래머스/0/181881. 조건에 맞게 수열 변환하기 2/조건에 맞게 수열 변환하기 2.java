import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] arr1 = new int[arr.length];
        
        while(!(Arrays.equals(arr,arr1))){
            int[] arr2 = new int[arr.length];
            answer++;
            for (int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0) arr1[i] = arr[i] / 2;
                else if(arr[i] < 50 && arr[i] % 2 == 1) arr1[i] = arr[i] * 2 + 1;
                else arr1[i] = arr[i];
            }
            for (int i=0; i<arr.length; i++) arr2[i] = arr[i];
            for (int i=0; i<arr.length; i++) arr[i] = arr1[i];
            for (int i=0; i<arr.length; i++) arr1[i] = arr2[i];
        }
        
        
        return answer;
    }
}