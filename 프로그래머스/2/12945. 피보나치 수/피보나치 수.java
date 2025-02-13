class Solution {
    public int solution(int n) {
        long a=0;
        long b=1;

        for(int i=2; i<=n; i++){
            long c = (a+b) % (long)1234567;
            a = b;
            b = c;
        }
        
        return (int) b;
    }
}