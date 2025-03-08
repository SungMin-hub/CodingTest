class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int len = arr.length;
        
        while(true){
            int n = 0;
            answer++;
            for(int i=0; i<len; i++){
                if(answer % arr[i] == 0) n++;
            }
            if(n == len) break;
        }
        
        return answer;
    }
}