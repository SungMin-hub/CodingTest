class Solution {
    public int solution(int n) {
        String str = "";
        while(n >= 3){
            str += n % 3;
            n /= 3;
        }
        str += n;
                
        return Integer.parseInt(str,3);
    }
}