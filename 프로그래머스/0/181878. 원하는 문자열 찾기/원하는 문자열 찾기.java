class Solution {
    public int solution(String myString, String pat) {
        String a=myString.toLowerCase();
        String b=pat.toLowerCase();
        
        if(a.contains(b)) return 1;
        return 0;
    }
}