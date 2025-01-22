class Solution {
    public int solution(int a, int b) {
        String strA = ""+a+b;
        String strB = ""+b+a;
        
        for(int i=0; i<strA.length(); i++){
            if(strA.charAt(i) > strB.charAt(i)) return Integer.parseInt(strA);
            else if(strA.charAt(i) < strB.charAt(i)) return Integer.parseInt(strB);
            else continue;
        }
        return Integer.parseInt(strA);
    }
}