class Solution {
    public boolean solution(String s) {
        if(s.length() != 4) {
            if(s.length() != 6) return false;
        }
        if(s.length() != 6) {
            if(s.length() != 4) return false;
        }
        
        s=s.toLowerCase();
        
        for(int i=0; i<s.length(); i++) if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') return false;
        
        return true;
    }
}