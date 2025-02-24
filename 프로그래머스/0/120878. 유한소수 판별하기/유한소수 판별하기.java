class Solution {
    public int solution(int a, int b) {
        int min = Math.min(a,b);
        int num = 1;
        
        for(int i=2; i<=min; i++){
            if(a % i == 0 && b % i == 0){
                a /= i;
                b /= i;
                i--;
            }
        }
        while(b > num){
            if(b % 2 == 0) b /= 2;
            else if(b % 5 == 0) b /= 5;
            else return 2;
        }
        if(b == 1) return 1;
        
        return 2;
    }
}