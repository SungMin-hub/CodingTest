class Solution {
    public int solution(int[][] dots) {
        
        if(inclination(dots[0],dots[1],dots[2],dots[3])) return 1;
        if(inclination(dots[0],dots[2],dots[1],dots[3])) return 1;
        if(inclination(dots[0],dots[3],dots[1],dots[2])) return 1;      
        
        return 0;
    }
    
    private boolean inclination(int[] dot1, int[] dot2, int[] dot3, int[] dot4){
        return (dot1[1] - dot2[1]) * (dot3[0] - dot4[0])  == (dot3[1] - dot4[1]) * (dot1[0] - dot2[0]);
    }
}