class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i,computers);
                answer++;
            }
        }
        
        return answer;
    }
    private void dfs(int i, int[][] computers){
        visited[i] = true;
        
        for(int j=0; j<computers.length; j++){
            if(!visited[j] && j != i && computers[i][j] == 1){
                dfs(j,computers);
            }
        }
    }
}