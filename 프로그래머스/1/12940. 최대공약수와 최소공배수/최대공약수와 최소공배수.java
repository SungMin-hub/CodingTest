class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int num = 0;
        // 최대 공약수의 곱과 최소 공배수의 곱은 두 수의 곱과 같다
        for(int i=1; i<=Math.min(n,m); i++) if(n % i == 0 && m % i == 0) num = i;
        
        answer[0] = num;
        answer[1] = n * m / num;
        
        return answer;
    }
}