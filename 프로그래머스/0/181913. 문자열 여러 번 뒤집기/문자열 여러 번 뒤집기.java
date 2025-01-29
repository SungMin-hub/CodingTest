class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i=0; i<queries.length;i++){
            String answer = "";
            int s = queries[i][0];
            int e = queries[i][1];
            
            for(int j=0; j<s; j++){
                answer += my_string.charAt(j);
            }
            for(int j=e; j>=s; j--){
                answer += my_string.charAt(j);
            }
            for(int j=e+1; j<my_string.length(); j++){
                answer += my_string.charAt(j);
            }
            my_string = answer;  
        }
        return my_string;
    }
}