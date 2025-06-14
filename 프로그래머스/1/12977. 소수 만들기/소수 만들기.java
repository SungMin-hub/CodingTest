class Solution {
    public int solution(int[] nums) {
        int len = nums.length;
        int answer = 0;
        
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                for(int k=j+1; k<len; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) answer++;
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}