class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            int num1 = queries[i][0];
            int num2 = queries[i][1];
            
            int temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
        }
        
        
        return arr;
    }
}