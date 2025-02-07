import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String str = "";
        
        Arrays.sort(spell);
        for(int i=0; i<spell.length; i++) str += spell[i];
        
        for(int i=0; i<dic.length; i++){
            char[] dic_spell = dic[i].toCharArray();
            Arrays.sort(dic_spell);
            String result = new String(dic_spell);
            if(str.equals(result)) return 1;
        }
        
        return answer;
    }
}