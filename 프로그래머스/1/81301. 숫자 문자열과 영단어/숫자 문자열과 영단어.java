class Solution {
    public int solution(String s) {
        String answer = "";
        String str = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                answer += s.charAt(i) - '0';
                continue;
            }
            str += s.charAt(i);
            switch(str){
                case "zero":
                    answer += 0;
                    str = "";
                    break;
                case "one":
                    answer += 1;
                    str = "";
                    break;
                case "two":
                    answer += 2;
                    str = "";
                    break;
                case "three":
                    answer += 3;
                    str = "";
                    break;
                case "four":
                    answer += 4;
                    str = "";
                    break;
                case "five":
                    answer += 5;
                    str = "";
                    break;
                case "six":
                    answer += 6;
                    str = "";
                    break;
                case "seven":
                    answer += 7;
                    str = "";
                    break;
                case "eight":
                    answer += 8;
                    str = "";
                    break;
                case "nine":
                    answer += 9;
                    str = "";
                    break;
            }
        }
        
        return Integer.parseInt(answer);
    }
}