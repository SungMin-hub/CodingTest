class Solution {
    public int[][] solution(int n) {
        int[][] map = new int[n][n];
        int x=0,y=0;
        int next_x=0,next_y=0;
        int cnt=1;
        
        int[] dirX = {1, 0, -1, 0};
        int[] dirY = {0, 1, 0, -1};
        int dir = 0;
        
        for(int i=0; i<n*n; i++){
            map[y][x] = cnt++;
            
            next_x = x + dirX[dir];
            next_y = y + dirY[dir];
                
            if(next_x < 0 || next_y < 0 || next_x >= n || next_y >= n || map[next_y][next_x] != 0) {
                dir = (dir+1) % 4;
                next_x = x + dirX[dir];
                next_y = y + dirY[dir];
            }
            x = next_x;
            y = next_y;
                
        }
        
        return map;
    }
}