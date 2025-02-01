import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger a_num = new BigInteger(a);
        BigInteger b_num = new BigInteger(b);
        
        return a_num.add(b_num).toString();
    }
}