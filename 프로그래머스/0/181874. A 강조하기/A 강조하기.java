class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'a') answer += 'A';
            else if(myString.charAt(i) > 'A' && myString.charAt(i) <= 'Z') answer += (char)(myString.charAt(i)+32);
            else answer += myString.charAt(i);
        }
        
        return answer;
    }
}