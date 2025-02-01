class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[a-zA-Z]");
        for(int i=0; i<arr.length; i++){
            if(!(arr[i].equals(""))) answer += Integer.parseInt(arr[i]); 
        }
        
        return answer;
    }
}