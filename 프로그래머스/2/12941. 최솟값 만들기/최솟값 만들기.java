import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int idx = 0;
        for(int i = A.length-1 ; i>=0; i--){
            answer += A[i] * B[idx++];
        }
        

        return answer;
    }
}