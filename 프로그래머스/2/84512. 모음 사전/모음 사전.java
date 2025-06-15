import java.util.*;

class Solution {
    char[] arr = {'A','E','I','O','U'};
    List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        
        makeStr("",0);
        
        return list.indexOf(word)+1;
    }
    
    private void makeStr(String str,int len){
        if(len > 5) return;
        
        if(!str.equals("")) list.add(str);
        
        for(int i=0; i<arr.length; i++){
            makeStr(str+arr[i], len+1);
        }
    }
}