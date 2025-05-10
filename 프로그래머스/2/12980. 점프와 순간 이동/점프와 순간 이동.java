import java.util.*;

public class Solution {
    int ans = 0;
    public int solution(int n) {

        while(n > 0){
            n = odd_num(n);
            if(n % 2 == 0)  n /= 2;
        }

        return ans;
    }
    
    private int odd_num(int num){
        if(num % 2 == 1){
            num--;
            ans++;
        }
        return num;
    }
}