class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max =0;
        int sum =0;
        
        for(int i =0; i<sides.length; i++){
            if(sides[i] > max){
                max = sides[i];
            }
            sum += sides[i];
        }
        
        if(sum - max <= max) answer = 2;
        else answer = 1;
        
        return answer;
    }
}