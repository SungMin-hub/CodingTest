class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int [] arr = new int[n+1];
        
        for(int i=0; i<n+1; i++) arr[i] = 1;
        
        for(int i=0; i<section.length; i++) arr[section[i]]--;
        
        int i = 1;

        while (i <= n) {
            if (arr[i] == 0) {                
                for (int j = i; j < i + m && j <= n; j++) {
                    arr[j] = 1;
                }
                answer++;
                i += m; 
            } else {
                i++;
            }
        }
        
        return answer;
    }
}