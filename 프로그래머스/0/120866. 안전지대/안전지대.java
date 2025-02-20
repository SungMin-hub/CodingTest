class Solution {
    public int solution(int[][] board) {
        int[][] map = new int[board.length][board.length];
        int answer = board.length * board.length;
        
        int[] dirX = {-1,0,1,1,1,0,-1,-1};
        int[] dirY = {-1,-1,-1,0,1,1,1,0};
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 1){
                    map[i][j] = -1;
                    for(int k=0; k<8; k++){
                        int x = j + dirX[k];
                        int y = i + dirY[k];
                        
                        if(x >= 0 && y >= 0 && x < board.length && y < board.length) map[y][x] = -1;
                    }    
                }     
            }
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(map[i][j] == -1) answer--;
            }
        }
        
        return answer;
    }
}