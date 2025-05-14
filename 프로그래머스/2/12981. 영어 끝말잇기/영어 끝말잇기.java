import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        int len = words.length-1;
        
        for(int i=0; i<len; i++){
            if(list.contains(words[i])) 
                return new int[]{i%n+1,i/n+1};
            list.add(words[i]);
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0))
                return new int[]{(i+1)%n+1,(i+1)/n+1};
        }
        if(list.contains(words[len])) return new int[]{len%n+1,len/n+1};

        return new int[]{0,0};
    }
}