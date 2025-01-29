class Solution {
    public int[] solution(int l, int r) {
        int idx = 0;
        for(int i=l; i<=r; i++){
            String str = Integer.toString(i);
            int cnt = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '0' || str.charAt(j) == '5') cnt++;
            }
            if (cnt == str.length()) idx++;
        }
        if(idx == 0) return new int[]{-1};
        
        int[] answer = new int[idx];
        
        idx = 0;
        for(int i=l; i<=r; i++){
            String str = Integer.toString(i);
            int cnt = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '0' || str.charAt(j) == '5') cnt++;
            }
            if (cnt == str.length()) answer[idx++] = i;
        }
        
        return answer;
    }
}