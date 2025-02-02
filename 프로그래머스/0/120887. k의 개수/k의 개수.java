class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int l=i; l<=j; l++){
            String str = Integer.toString(l);
            for(int m=0; m<str.length(); m++){
                if(str.charAt(m) == k+'0') answer++;
            }
        }
        
        return answer;
    }
}