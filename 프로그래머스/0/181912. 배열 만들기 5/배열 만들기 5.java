import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String[] answer = new String[intStrs.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<answer.length; i++) answer[i] = "";
        
        for(int i=0; i<intStrs.length; i++){
            for(int j=s; j<s+l; j++) answer[i] += intStrs[i].charAt(j);
            if(Integer.parseInt(answer[i]) > k) list.add(Integer.parseInt(answer[i]));
        }
        
        int[] ans = new int[list.size()];
        for(int i=0; i<ans.length; i++) ans[i] = list.get(i);
        
        return ans;
    }
}