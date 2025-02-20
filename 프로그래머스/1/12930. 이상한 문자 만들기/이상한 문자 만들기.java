class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split(" ",-1);
        
        for(int i=0; i<word.length; i++){
            for(int j=0; j<word[i].length(); j++){
                answer += j % 2 == 0 ? Character.toUpperCase(word[i].charAt(j)) : Character.toLowerCase(word[i].charAt(j));
            }
            if(i < word.length - 1) answer += ' ';
        }
        
        return answer;
    }
}