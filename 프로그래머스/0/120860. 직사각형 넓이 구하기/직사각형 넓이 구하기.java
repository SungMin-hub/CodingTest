class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;
        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;
        
        for(int i=0; i<dots.length; i++){
            if(dots[i][0] > max_x) max_x = dots[i][0];
            if(dots[i][0] < min_x) min_x = dots[i][0];
        }
        for(int i=0; i<dots.length; i++){
            if(dots[i][1] > max_y) max_y = dots[i][1];
            if(dots[i][1] < min_y) min_y = dots[i][1];
        }

        return answer = (max_x - min_x) * (max_y - min_y);
    }
}