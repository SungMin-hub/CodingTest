import java.util.*;

class Solution {
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int a = maps.length;
        int b = maps[0].length;
        
        int[][] dist = new int[a][b];
        Queue<int[]> q = new LinkedList<>();
        
        if(maps[0][0] == 0) return -1;
        
        dist[0][0] = 1;
        q.add(new int[]{0,0});
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];
            
            if(y == a-1 && x == b-1) return dist[y][x];
            
            for(int i=0; i<4; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                
                if(ny < 0 || nx < 0 || ny >= a || nx >= b) continue;
                if(maps[ny][nx] == 0 ) continue;
                if(dist[ny][nx] != 0) continue;
                
                dist[ny][nx] = dist[y][x] + 1;
                q.add(new int[]{ny, nx});
            }
        }
        
        return -1;
    }
}