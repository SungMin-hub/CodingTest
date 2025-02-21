class Solution {
    public int solution(int[][] sizes) {
        int max = 0, min = 0;
        int[] b_sizes = new int[sizes.length];
        int[] s_sizes = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++){
            b_sizes[i] = Math.max(sizes[i][0],sizes[i][1]);
            s_sizes[i] = Math.min(sizes[i][0],sizes[i][1]);
        }
        
        for(int i=0; i<sizes.length; i++){
            max = Math.max(b_sizes[i],max);
            min = Math.max(s_sizes[i],min);
        }
        
        return max * min;
    }
}