class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(int i=0; i<keyinput.length; i++){
            switch (keyinput[i]){
                  case "left":
                    answer[0]--;
                    if(answer[0] < (-1)*(board[0] / 2)) answer[0]++;
                    break;
                case "right":
                    answer[0]++;
                    if(answer[0] > (board[0] / 2)) answer[0]--;
                    break;
                case "up":
                    answer[1]++;
                    if(answer[1] > (board[1] / 2)) answer[1]--;
                    break;
                case "down":
                    answer[1]--;
                    if(answer[1] < (-1)*(board[1] / 2)) answer[1]++;
                    break;  
            } 
        }
        
        return answer;
    }
}