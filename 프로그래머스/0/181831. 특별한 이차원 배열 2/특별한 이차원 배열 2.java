class Solution {
    public int solution(int[][] arr) {
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++)
                if(arr[i][j] == arr[j][i]) cnt++;
        }
        
        return cnt == arr.length*arr.length ? 1 : 0;
    }
}