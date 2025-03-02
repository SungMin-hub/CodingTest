class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            if(food[i] % 2 != 0) food[i]--;
            for(int j=0; j<food[i]/2; j++)answer += i;
        }
        answer += 0;
        for(int i=food.length-1; i>=1; i--){
            for(int j=0; j<food[i]/2; j++) answer += i;
        }
        return answer;
    }
}